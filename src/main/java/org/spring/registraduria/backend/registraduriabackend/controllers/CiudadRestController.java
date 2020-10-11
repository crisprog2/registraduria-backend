package org.spring.registraduria.backend.registraduriabackend.controllers;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaCiudad;
import org.spring.registraduria.backend.registraduriabackend.model.services.ICiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class CiudadRestController {

    @Autowired
    private ICiudadService ciudadService;

    @GetMapping("/ciudades")
    public List<TablaCiudad> index(){
        return ciudadService.findAll();
    }
    
}