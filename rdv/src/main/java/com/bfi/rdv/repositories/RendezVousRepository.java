package com.bfi.rdv.repositories;

import com.bfi.rdv.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {
    // Additional query methods can be defined here if needed
}
