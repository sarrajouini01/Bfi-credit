package com.bfi.reclamation.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
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
