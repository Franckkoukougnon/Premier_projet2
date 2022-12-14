package com.simplon.Premier_projet2.entity;

import jakarta.persistence.*;

@Entity
public class Pays
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "capital", nullable = false)
    private Long capital;
    String langueNational;

    int population;

    String pib;

    public Long getCapital() {
        return capital;
    }

    public void setCapital(Long capital) {
        this.capital = capital;
    }
}
