package org.spring.registraduria.backend.registraduriabackend.controllers;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaMesa;
import org.spring.registraduria.backend.registraduriabackend.model.services.IMesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class MesaController {
    
    @Autowired
    private IMesaService mesaService;

    @GetMapping("/mesas")
    public List<TablaMesa> index(){
        return mesaService.findAll();
    }

}
