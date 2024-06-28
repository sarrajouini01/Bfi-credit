package com.bfi.reclamation.repositories;

import com.bfi.reclamation.entities.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReclamationRepository extends JpaRepository<Reclamation, Long> {
    // Additional query methods can be defined here if needed
}
