package com.aaditya.expense.tracker.services;

import com.aaditya.expense.tracker.model.Groups;
import com.aaditya.expense.tracker.model.Settlement;
import com.aaditya.expense.tracker.model.Users;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DebtSimplificationService {

    public List<Settlement> simplifyDebts(Map<Users, Double> balances, Groups group) {
        List<Settlement> settlements = new ArrayList<>();

        PriorityQueue<Map.Entry<Users, Double>> creditors = new PriorityQueue<>((a, b) -> Double.compare(b.getValue(), a.getValue()));
        PriorityQueue<Map.Entry<Users, Double>> debtors = new PriorityQueue<>(Comparator.comparingDouble(Map.Entry::getValue));

        for (Map.Entry<Users, Double> entry : balances.entrySet()) {
            if (entry.getValue() > 0) {
                creditors.offer(entry);
            } else if (entry.getValue() < 0) {
                debtors.offer(entry);
            }
        }

        while (!creditors.isEmpty() && !debtors.isEmpty()) {
            Map.Entry<Users, Double> creditor = creditors.poll();
            Map.Entry<Users, Double> debtor = debtors.poll();

            double settledAmount = Math.min(creditor.getValue(), -debtor.getValue());

            settlements.add(Settlement.builder()
                    .fromUser(debtor.getKey())
                    .toUser(creditor.getKey())
                    .group(group)
                    .amount(settledAmount)
                    .build());

            creditor.setValue(creditor.getValue() - settledAmount);
            debtor.setValue(debtor.getValue() + settledAmount);

            if (creditor.getValue() > 0) creditors.offer(creditor);
            if (debtor.getValue() < 0) debtors.offer(debtor);
        }

        return settlements;
    }
}
