package com.simplon.Premier_projet2.controller;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.awt.*;

@Entity @NoArgsConstructor
public class Voiture {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  String color;
  String name;

  int price;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Voiture(Color color, String name, int price) {

  }




}
