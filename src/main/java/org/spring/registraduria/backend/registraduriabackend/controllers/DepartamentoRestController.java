package org.spring.registraduria.backend.registraduriabackend.controllers;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaDepartamento;
import org.spring.registraduria.backend.registraduriabackend.model.services.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class DepartamentoRestController {
    
    @Autowired
    private IDepartamentoService departamentoService;

    @GetMapping("/departamentos")
    public List<TablaDepartamento> index(){
        return departamentoService.findAll();
    }

    @GetMapping("/departamento/{codDepartamento}")
    public TablaDepartamento show(@PathVariable String codDepartamento){    
        return departamentoService.findById(codDepartamento);   
    }

    @PostMapping("/departamento")
    @ResponseStatus(HttpStatus.CREATED)
    public TablaDepartamento create(@RequestBody TablaDepartamento departamento){
        return departamentoService.create(departamento);
    }

}
