package org.spring.registraduria.backend.registraduriabackend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.dtos.PersonaDto;
import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaPersona;
import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaRegistro;
import org.spring.registraduria.backend.registraduriabackend.model.services.IMesaService;
import org.spring.registraduria.backend.registraduriabackend.model.services.IPersonaService;
import org.spring.registraduria.backend.registraduriabackend.model.services.IRegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @Autowired 
    private IMesaService mesaService;

    @Autowired
    private IRegistroService registroService;

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
            if (tablaPersona.getJurado().equals("Y")) {
                personaDto.setJurado("Es Jurado");
            } else {
                personaDto.setJurado("No es Jurado");
            }
            personaDto.setMesa(tablaPersona.getCod_Mesa().getMesa());
            personaDtos.add(personaDto);
        }
        return personaDtos;
    }

    @PostMapping("/persona")
    @ResponseStatus(HttpStatus.CREATED)
    public TablaPersona create(@RequestBody PersonaDto personaDto){
        TablaPersona tablaPersona=new TablaPersona();
        TablaRegistro tablaRegistro=new TablaRegistro();
        tablaPersona.setCedula(personaDto.getCedula());
        tablaPersona.setPrimerNombre(personaDto.getPrimerNombre());
        tablaPersona.setSegundoNombre(personaDto.getSegundoNombre());
        tablaPersona.setPrimerApellido(personaDto.getPrimerApellido());
        tablaPersona.setSegundoApellido(personaDto.getSegundoApellido());
        tablaPersona.setGenero(personaDto.getGenero());
        tablaPersona.setEdad(personaDto.getEdad());
        tablaPersona.setJurado(personaDto.getJurado());
        tablaPersona.setCod_Mesa(mesaService.findById((long) personaDto.getMesa()));
        tablaRegistro.setRegistro(0);
        tablaRegistro.setPersona(tablaPersona);
        TablaPersona persona=personaService.create(tablaPersona);
        registroService.save(tablaRegistro);
        return persona;
        
    }

    @GetMapping("/persona/{cedula}")
    public PersonaDto show(@PathVariable int cedula){
        PersonaDto personaDto=new PersonaDto();
        TablaPersona tablaPersona=personaService.findById(cedula);
        if (tablaPersona!=null) {
            personaDto.setCedula(tablaPersona.getCedula());
            personaDto.setPrimerNombre(tablaPersona.getPrimerNombre());
            personaDto.setSegundoNombre(tablaPersona.getSegundoNombre());
            personaDto.setPrimerApellido(tablaPersona.getPrimerApellido());
            personaDto.setSegundoApellido(tablaPersona.getSegundoApellido());
            personaDto.setGenero(tablaPersona.getGenero());
            personaDto.setEdad(tablaPersona.getEdad());
            if (tablaPersona.getJurado().equals("Y")) {
                personaDto.setJurado("Es Jurado");
            } else {
                personaDto.setJurado("No es Jurado");
            }
            personaDto.setMesa(tablaPersona.getCod_Mesa().getMesa());
        } else {
            personaDto=null;
        }
        return personaDto;
    }

    @PutMapping("/persona/{cedula}")
    @ResponseStatus(HttpStatus.CREATED)
    public TablaPersona update(@RequestBody PersonaDto personaDto, @PathVariable int cedula){
        TablaPersona tablaPersona=personaService.findById(cedula);
        tablaPersona.setPrimerNombre(personaDto.getPrimerNombre());
        tablaPersona.setSegundoNombre(personaDto.getSegundoNombre());
        tablaPersona.setPrimerApellido(personaDto.getPrimerApellido());
        tablaPersona.setSegundoApellido(personaDto.getSegundoApellido());
        tablaPersona.setGenero(personaDto.getGenero());
        tablaPersona.setEdad(personaDto.getEdad());
        tablaPersona.setJurado(personaDto.getJurado());
        tablaPersona.setCod_Mesa(mesaService.findById((long) personaDto.getMesa()));
        return personaService.create(tablaPersona);
    }

    @DeleteMapping("/persona/{cedula}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int cedula){
        personaService.delete(cedula);
    }
}
