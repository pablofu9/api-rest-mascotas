package com.example.furu.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data //Usamos lombok para generar getters, setters, un constructor vacio, uno lleno y el metodo toString()
@Entity
@Table(name="perro")
public class Perro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perro")
    private int id_perro;

    @Column(name = "nombre_perro")
    private String nombre_perro;

    @Column(name = "raza_perro")
    private String raza_perro;

    @Column(name = "peso")
    private int peso;

    @Column(name = "color")
    private String color;

    public Perro(String nombre_perro, String raza_perro, Integer peso, String color) {
        this.nombre_perro = nombre_perro;
        this.raza_perro = raza_perro;
        this.peso = peso;
        this.color = color;
    }
}
