package com.bfi.rdv.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRdv;
    private Date dateRdv;
    @Enumerated(EnumType.STRING)
    private Mode mode;
    private String sujet;
}
