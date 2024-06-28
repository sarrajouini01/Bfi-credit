package com.bfi.credit.repositories;

import com.bfi.credit.entities.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<Credit, Long> {
    // Additional query methods can be defined here if needed
}
