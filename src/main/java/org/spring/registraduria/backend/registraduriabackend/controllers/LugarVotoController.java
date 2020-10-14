package org.spring.registraduria.backend.registraduriabackend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.dtos.LugarVotoDto;
import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaLugarVoto;
//import org.spring.registraduria.backend.registraduriabackend.model.services.ICiudadService;
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
    
    /*@Autowired
    private ICiudadService ciudadService;*/


    @GetMapping("/lugares")
    public List<LugarVotoDto> index(){
        List<LugarVotoDto> lugarVotoDtos = new ArrayList<LugarVotoDto>();
        List<TablaLugarVoto> lugarVotos = lugarVotoService.findAll();
        for (TablaLugarVoto tablaLugarVoto : lugarVotos) {
            LugarVotoDto lugarVotoDto = new LugarVotoDto();
            lugarVotoDto.setCodLugarVoto(tablaLugarVoto.getCodLugarVoto());
            lugarVotoDto.setNombreLugar(tablaLugarVoto.getNombreLugar());
            lugarVotoDto.setDireccionVoto(tablaLugarVoto.getDireccionVoto());
            lugarVotoDto.setCiudad(tablaLugarVoto.getCod_Ciudad().getCiudad());
            lugarVotoDtos.add(lugarVotoDto);
        }
        return lugarVotoDtos;
    }
    
}
