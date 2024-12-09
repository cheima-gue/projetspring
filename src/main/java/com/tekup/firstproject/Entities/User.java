package com.tekup.firstproject.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int clientId;

    @Column(nullable = false)
    private String firstName;

    @Column(unique = true, nullable = false)
    private String cin;

    @Column(nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    UserRole role;

    @OneToMany(mappedBy = "user")
    private List<Cours> cours;

    @OneToMany(mappedBy = "user2")
    private List<Notification> notifications;

   @OneToMany(mappedBy = "user3")
    private List<Paiement> paiements;

   @OneToMany(mappedBy = "user4")
    private List<Avis> avis;
}

