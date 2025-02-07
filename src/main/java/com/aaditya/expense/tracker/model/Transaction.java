package com.aaditya.expense.tracker.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "payer_id", nullable = false)
    private Users payer;

    @ManyToOne
    @JoinColumn(name = "payee_id", nullable = false)
    private Users payee;

    private double amount;

    @ManyToOne
    @JoinColumn(name = "expense_id", nullable = false)
    private Expense expense;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
