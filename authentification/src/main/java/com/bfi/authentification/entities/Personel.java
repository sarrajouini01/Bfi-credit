package com.bfi.authentification.entities;
import com.bfi.authentification.entities.enums.Role;
import jakarta.persistence.*;
@Entity
public class Personel extends User {
    @Enumerated(EnumType.STRING)
    private Role role;
}
