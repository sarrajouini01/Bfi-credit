package com.bfi.authentification.entities;
import com.bfi.authentification.entities.enums.Role;
import jakarta.persistence.*;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="usert")
@Builder
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private String telephone;
    private Role role;


}
