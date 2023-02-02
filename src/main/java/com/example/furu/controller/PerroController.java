package com.example.furu.controller;

import com.example.furu.model.Perro;
import com.example.furu.services.PerroServicioImp;
import io.swagger.annotations.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/")

public class PerroController {

    @Autowired
    PerroServicioImp perroServicioImp;

    //Nos devuelve la lista entera de los perros que hay
    @GetMapping("/perros")
    public List<Perro> getPerros(){
        return perroServicioImp.getAllPerros();
    }

    //Para guardar un perro nuevo
    @PostMapping("/save")
    public ResponseEntity<Perro> savePerro(@RequestBody Perro perro){
        Perro perroNuevo = perroServicioImp.save(perro);
        return new ResponseEntity<>(perroNuevo, HttpStatus.CREATED);
    }

    //Para sacar un perro por su id
    @GetMapping("/perros/{id}")
    public Perro getPerroByid(@PathVariable int id){
        return perroServicioImp.getById(id);
    }

    //Para hacer un update de un perro
    @PutMapping("/perros/{id}")
    public ResponseEntity<Perro> update(@PathVariable int id,@RequestBody Perro perro){
        Perro perroid = perroServicioImp.getById(id);
        perroid.setNombre_perro(perro.getNombre_perro());
        perroid.setRaza_perro(perro.getRaza_perro());
        perroid.setPeso(perro.getPeso());
        perroid.setColor(perro.getColor());
        Perro perroNuevo = perroServicioImp.save(perroid);
        return new ResponseEntity<>(perroNuevo, HttpStatus.CREATED);
    }

    //Esto cuando se borre, nos va a dar un mensaje que nos dicec eliminado, asi podemos comprobar si se ha hecho correctamente
    @DeleteMapping("/perros/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarPerro(@PathVariable int id){
        this.perroServicioImp.delete(id);

        HashMap<String, Boolean> estadoPerroEliminado = new HashMap<>();
        estadoPerroEliminado.put("Eliminado", true);
        return ResponseEntity.ok(estadoPerroEliminado);
    }
}
