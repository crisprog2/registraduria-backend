package org.spring.registraduria.backend.registraduriabackend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.dtos.DepartamentoDto;
import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaDepartamento;
import org.spring.registraduria.backend.registraduriabackend.model.services.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public List<DepartamentoDto> index(){
        List<DepartamentoDto> departamentoDtos=new ArrayList<DepartamentoDto>();
        List<TablaDepartamento> departamentos=departamentoService.findAll();
        for (TablaDepartamento tablaDepartamento : departamentos) {
            DepartamentoDto departamentoDto=new DepartamentoDto();
            departamentoDto.setCodDepartamento(tablaDepartamento.getCodDepartamento());
            departamentoDto.setDepartamento(tablaDepartamento.getDepartamento());
            departamentoDtos.add(departamentoDto);
        }
        return departamentoDtos;
    }

    @GetMapping("/departamento/{codDepartamento}")
    public DepartamentoDto show(@PathVariable String codDepartamento){
        DepartamentoDto departamentoDto=new DepartamentoDto();
        TablaDepartamento tablaDepartamento=departamentoService.findById(codDepartamento);
        if (tablaDepartamento!=null) {
            departamentoDto.setCodDepartamento(tablaDepartamento.getCodDepartamento());
            departamentoDto.setDepartamento(tablaDepartamento.getDepartamento());
        } else {
            departamentoDto=null;
        }
        
        return departamentoDto;   
    }

    @PostMapping("/departamento")
    @ResponseStatus(HttpStatus.CREATED)
    public TablaDepartamento create(@RequestBody DepartamentoDto departamento){
        TablaDepartamento tablaDepartamento=new TablaDepartamento();
        tablaDepartamento.setCodDepartamento(departamento.getCodDepartamento());
        tablaDepartamento.setDepartamento(departamento.getDepartamento());
        return departamentoService.create(tablaDepartamento);
    }

    @PutMapping("/departamento/{codDepartamento}")
    @ResponseStatus(HttpStatus.CREATED)
    public TablaDepartamento update(@RequestBody DepartamentoDto departamentoDto, @PathVariable String codDepartamento){
        TablaDepartamento departamento=departamentoService.findById(codDepartamento);
        departamento.setDepartamento(departamentoDto.getDepartamento());
        return departamentoService.create(departamento);
    }

    @DeleteMapping("/departamento/{codDepartamento}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String codDepartamento){
        departamentoService.delete(codDepartamento);
    }

}
