package org.spring.registraduria.backend.registraduriabackend.controllers;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaLugarVoto;
import org.spring.registraduria.backend.registraduriabackend.model.services.ILugarVotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class LugarVotoController {

    @Autowired
    private ILugarVotoService lugarVotoService;

    @GetMapping("/lugares")
    public List<TablaLugarVoto> index(){
        return lugarVotoService.findAll();
    }
    
}
