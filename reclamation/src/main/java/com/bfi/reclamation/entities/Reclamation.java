package com.bfi.reclamation.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRec;
    private String sujet;
    private String description;
    private Date dateSoumission;
    @Enumerated(EnumType.STRING)
    private StatRec status;
}
