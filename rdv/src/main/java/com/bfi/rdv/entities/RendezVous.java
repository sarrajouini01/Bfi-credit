package com.bfi.rdv.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRdv;
    private Date dateRdv;
    @Enumerated(EnumType.STRING)
    private Mode mode;
    private String sujet;
}
