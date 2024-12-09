package com.tekup.firstproject.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Identifiant unique pour chaque notification

    @Column(nullable = false)
    private String message;  // Message de la notification

    @Column(nullable = false)
    private LocalDateTime dateEnvoi;  // Date et heure de l'envoi de la notification

    @Column(nullable = false)
    private boolean statut;  // Statut de la notification (lu ou non)

    @ManyToOne
    private User user2;
}
