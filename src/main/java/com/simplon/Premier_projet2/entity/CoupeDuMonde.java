package com.simplon.Premier_projet2.entity;


import jakarta.persistence.*;

@Entity
public class CoupeDuMonde {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private long coupe_du_monde;

    String nom_equipe;
    String nomButeur;

    int nombrejoueur;



}
