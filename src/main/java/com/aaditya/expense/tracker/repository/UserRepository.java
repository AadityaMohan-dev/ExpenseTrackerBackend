package com.aaditya.expense.tracker.repository;

import com.aaditya.expense.tracker.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    // Check if a user exists by email
    boolean existsByEmailAddress(String emailAddress);

}

