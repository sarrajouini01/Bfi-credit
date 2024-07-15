package com.bfi.authentification;

import com.bfi.authentification.DTO.Credit;
import com.bfi.authentification.DTO.RendezVous;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullUserResponseForRdv {
    private String nom;
    private String prenom;
    List<RendezVous> rendezVous;


}
