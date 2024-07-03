package com.bfi.authentification.entities;

import com.bfi.authentification.entities.enums.TClient;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client extends User implements Serializable {
    @Enumerated(EnumType.STRING)
    private TClient typeClient;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private Set<CompteBancaire> compteBancaires;
}