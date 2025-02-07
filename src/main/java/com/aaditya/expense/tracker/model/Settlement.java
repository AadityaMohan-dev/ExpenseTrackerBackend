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
@Table(name = "settlements")
public class Settlement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "from_user_id", nullable = false)
    private Users fromUser;

    @ManyToOne
    @JoinColumn(name = "to_user_id", nullable = false)
    private Users toUser;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private Groups group;

    private double amount;

    @CreationTimestamp
    private LocalDateTime settledAt;
}
