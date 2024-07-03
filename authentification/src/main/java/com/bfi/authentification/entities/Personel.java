package com.bfi.authentification.entities;
import com.bfi.authentification.entities.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Personel extends User implements Serializable {
    @Enumerated(EnumType.STRING)
    private Role role;
}
