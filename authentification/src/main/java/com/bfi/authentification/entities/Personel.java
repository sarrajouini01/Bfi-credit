package com.bfi.authentification.entities;
import com.bfi.authentification.entities.enums.Role;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
public class Personel extends User {
    @Enumerated(EnumType.STRING)
    private Role role;

}
