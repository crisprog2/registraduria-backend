package org.spring.registraduria.backend.registraduriabackend.controllers;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaPersona;
import org.spring.registraduria.backend.registraduriabackend.model.services.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/personas")
    public List<TablaPersona> index(){
        return personaService.findAll();
    }
    
}
