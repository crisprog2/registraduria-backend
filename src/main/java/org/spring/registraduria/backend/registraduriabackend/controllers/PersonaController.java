package org.spring.registraduria.backend.registraduriabackend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.dtos.PersonaDto;
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
    public List<PersonaDto> index(){
        List<PersonaDto> personaDtos=new ArrayList<PersonaDto>();
        List<TablaPersona> personas=personaService.findAll();
        for (TablaPersona tablaPersona : personas) {
            PersonaDto personaDto=new PersonaDto();
            personaDto.setPrimerNombre(tablaPersona.getPrimerNombre());
            personaDto.setSegundoNombre(tablaPersona.getSegundoNombre());
            personaDto.setPrimerApellido(tablaPersona.getPrimerApellido());
            personaDto.setSegundoApellido(tablaPersona.getSegundoApellido());
            personaDto.setCedula(tablaPersona.getCedula());
            personaDto.setGenero(tablaPersona.getGenero());
            personaDto.setEdad(tablaPersona.getEdad());
            personaDto.setJurado(tablaPersona.getJurado());
            personaDto.setMesa(tablaPersona.getCod_Mesa().getMesa());
            personaDtos.add(personaDto);
        }
        return personaDtos;
    }
    
}
