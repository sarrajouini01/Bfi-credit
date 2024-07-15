package com.bfi.authentification;

import com.bfi.authentification.DTO.Credit;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullUserResponseForCredit {
    private String nom;
    private String prenom;
    List<Credit> credits;


}
