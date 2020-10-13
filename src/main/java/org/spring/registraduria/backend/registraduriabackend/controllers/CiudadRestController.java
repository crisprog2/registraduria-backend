package org.spring.registraduria.backend.registraduriabackend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.dtos.CiudadDto;
import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaCiudad;
import org.spring.registraduria.backend.registraduriabackend.model.services.ICiudadService;
import org.spring.registraduria.backend.registraduriabackend.model.services.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class CiudadRestController {

    @Autowired
    private ICiudadService ciudadService;

    @Autowired
    private IDepartamentoService departamentoService;

    @GetMapping("/ciudades")
    public List<CiudadDto> index(){
        List<CiudadDto> ciudadesDtos=new ArrayList<CiudadDto>();
        List<TablaCiudad> ciudades=ciudadService.findAll();
        for (TablaCiudad tablaCiudad : ciudades) {
            CiudadDto ciudadDto=new CiudadDto();
            ciudadDto.setCodCiudad(tablaCiudad.getCodCiudad());
            ciudadDto.setCiudad(tablaCiudad.getCiudad());
            ciudadDto.setDepartamento(tablaCiudad.getCod_Departamento().getDepartamento());
            ciudadesDtos.add(ciudadDto);
        }
        return ciudadesDtos;
    }

    @PostMapping("/ciudad")
    @ResponseStatus(HttpStatus.CREATED)
    public TablaCiudad create (@RequestBody CiudadDto ciudad){
        TablaCiudad tablaCiudad=new TablaCiudad();
        tablaCiudad.setCodCiudad(ciudad.getCodCiudad());
        tablaCiudad.setCiudad(ciudad.getCiudad());
        tablaCiudad.setCod_Departamento(departamentoService.findById(ciudad.getDepartamento()));
        return ciudadService.create(tablaCiudad);
    }
    
}
