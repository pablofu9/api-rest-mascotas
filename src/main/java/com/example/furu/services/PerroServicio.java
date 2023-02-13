package com.example.furu.services;

import com.example.furu.model.Perro;
import com.example.furu.repository.PerroRepositorio;

import java.util.List;

public interface PerroServicio {

     public List<Perro> getAllPerros();

     public Perro save(Perro perro);

     public Perro getById(int id);

     public void delete(int id);

     public Perro getPerroByName(String nombre);
}
