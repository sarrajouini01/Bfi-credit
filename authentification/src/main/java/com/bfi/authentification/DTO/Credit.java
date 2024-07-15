package com.bfi.authentification.DTO;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Credit {
    Double montant;
    Date dateDemande;
    Integer dureeCredit;

}