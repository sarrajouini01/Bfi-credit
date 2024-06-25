package com.bfi.authentification.entities;

import com.bfi.authentification.entities.enums.TCompte;
import jakarta.persistence.*;

import java.util.Date;
@Entity
public class CompteBancaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompte;
    private String numeroCompte;
    private float solde;
    private Date dateOverture;
    @Enumerated(EnumType.STRING)
    private TCompte typeCompte;
    @ManyToOne
    private Client client;
}
