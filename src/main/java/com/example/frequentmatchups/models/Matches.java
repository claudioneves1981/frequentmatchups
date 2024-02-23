package com.example.frequentmatchups.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Matches {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "ID_MATCHES")
     private Long id;

     @ManyToOne(cascade=CascadeType.ALL)
     @JoinTable(
             name="TB_MATCHES_COUNTRY_A",
             joinColumns = @JoinColumn(name = "ID_MATCHES", referencedColumnName = "ID_MATCHES"),
             inverseJoinColumns = @JoinColumn(name = "ID_COUNTRY",referencedColumnName = "ID_COUNTRY")
     )
     private Countries country_a;

     @ManyToOne(cascade=CascadeType.ALL)
     @JoinTable(
             name="TB_MATCHES_COUNTRY_B",
             joinColumns = @JoinColumn(name = "ID_MATCHES", referencedColumnName = "ID_MATCHES"),
             inverseJoinColumns = @JoinColumn(name = "ID_COUNTRY",referencedColumnName = "ID_COUNTRY")
     )
     private Countries country_b;

     @Column(name="GOALS_COUNTRY_A")
     private Integer goalsCountryA;

     @Column(name="GOALS_COUNTRY_B")
     private Integer goalsCountryB;

     @Column(name="YEAR_MATCH")
     private Integer yearMatch;

     @Column(name="ENCOUNTER_MATCH")
     private String encounterMatch;

}
