package com.bfi.authentification.entities;

import com.bfi.authentification.entities.enums.TClient;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Client extends User {
    @Enumerated(EnumType.STRING)
    private TClient typeClient;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private Set<CompteBancaire> compteBancaires;
}