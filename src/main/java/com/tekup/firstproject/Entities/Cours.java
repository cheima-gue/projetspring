    package com.tekup.firstproject.Entities;

    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    import java.io.Serializable;

    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Cours implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int coursId;

        @Column(nullable = false)
        private String titre;

        @Column(nullable = false)
        private String description;

        @Column(nullable = false)
        private int duree;  // Durée en heures

        @Column(nullable = true)
        private String niveau;

        @Enumerated(EnumType.STRING)
        CoursType type;

        @ManyToOne
        User user;

        @ManyToOne
        Cours cours;

        @ManyToOne
        Session session;
    }
