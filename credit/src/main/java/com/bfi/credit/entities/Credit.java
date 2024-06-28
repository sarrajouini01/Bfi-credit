package com.bfi.credit.entities;

import com.bfi.credit.entities.enums.StatutCredit;
import com.bfi.credit.entities.enums.TypeCredit;
import com.bfi.credit.entities.enums.TypeUnite;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Credit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idCredit;
    @Enumerated(EnumType.STRING)
    TypeCredit typeCredit;
    Double montant;
    Date dateDemande;
    @Enumerated(EnumType.STRING)
    StatutCredit statutCredit;
    Integer dureeCredit;
    @Enumerated(EnumType.STRING)
    TypeUnite typeUnite;

    @OneToOne
    ContratCredit contratCredit;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="credit")
    private Set<DocAttache> docAttaches;
}