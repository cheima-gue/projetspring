package com.tekup.firstproject.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Performance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double caloriesBrulees;

    @Column(nullable = false)
    private double tempsEntrainement;  // Temps d'entraînement en minutes

    @Column(nullable = false)
    private LocalDate datePerformance;  // Date de la performance


}
