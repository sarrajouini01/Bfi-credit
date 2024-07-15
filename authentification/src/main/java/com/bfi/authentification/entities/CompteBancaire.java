package com.bfi.authentification.entities;

import com.bfi.authentification.entities.enums.TCompte;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompteBancaire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompte;
    private String numeroCompte;
    private float solde;
    private Date dateOverture;
    @Enumerated(EnumType.STRING)
    private TCompte typeCompte;
    @ManyToOne
    private User client;
}
