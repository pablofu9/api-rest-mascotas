package com.example.furu.repository;

import com.example.furu.model.Perro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository //Se pone a clases o interfaces que acceden a las bd
public interface PerroRepositorio extends JpaRepository<Perro, Integer> {

    @Query("SELECT p FROM Perro p WHERE p.nombre_perro = ?1")
    Perro getPerroByName(String nombre);
}
