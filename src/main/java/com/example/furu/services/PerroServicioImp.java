package com.example.furu.services;

import com.example.furu.model.Perro;
import com.example.furu.repository.PerroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerroServicioImp implements PerroServicio{

    //Aqui haremos una inyeccion de dependencia de la interfaz de repositorio
    @Autowired
    PerroRepositorio repositorio;

    @Override
    public List<Perro> getAllPerros() {
        return repositorio.findAll();
    }

    @Override
    public Perro save(Perro perro) {
        return repositorio.save(perro);
    }

    @Override
    public Perro getById(int id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        repositorio.deleteById(id);
    }

    @Override
    public Perro getPerroByName(String nombre){
        return repositorio.getPerroByName(nombre);

    }
    public void deleteByName(String nombre){
        repositorio.delete(getPerroByName(nombre));
    }
}
