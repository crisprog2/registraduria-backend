package org.spring.registraduria.backend.registraduriabackend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.dtos.LugarVotoDto;
import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaLugarVoto;
import org.spring.registraduria.backend.registraduriabackend.model.services.ICiudadService;
import org.spring.registraduria.backend.registraduriabackend.model.services.ILugarVotoService;
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
public class LugarVotoController {

    @Autowired
    private ILugarVotoService lugarVotoService;
    
    @Autowired
    private ICiudadService ciudadService;


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

    @PostMapping("/lugar")
    @ResponseStatus(HttpStatus.CREATED)
    public TablaLugarVoto create (@RequestBody LugarVotoDto lugarVotoDto){
        TablaLugarVoto lugarVoto=new TablaLugarVoto();
        lugarVoto.setCodLugarVoto(lugarVotoDto.getCodLugarVoto());
        lugarVoto.setNombreLugar(lugarVotoDto.getNombreLugar());
        lugarVoto.setDireccionVoto(lugarVotoDto.getDireccionVoto());
        lugarVoto.setCod_Ciudad(ciudadService.findById(lugarVotoDto.getCiudad()));
        return lugarVotoService.create(lugarVoto);
    }

    @GetMapping("/lugar/{codLugarVoto}")
    public LugarVotoDto show (@PathVariable String codLugarVoto){
        LugarVotoDto lugarVotoDto=new LugarVotoDto();
        TablaLugarVoto lugarVoto=lugarVotoService.findById(codLugarVoto);
        if (lugarVoto!=null) {
            lugarVotoDto.setCodLugarVoto(lugarVoto.getCodLugarVoto());
            lugarVotoDto.setNombreLugar(lugarVoto.getNombreLugar());
            lugarVotoDto.setDireccionVoto(lugarVoto.getDireccionVoto());
            lugarVotoDto.setCiudad(lugarVoto.getCod_Ciudad().getCiudad());
        } else {
            lugarVotoDto=null;
        }
        return lugarVotoDto;
    }

    @PutMapping("/lugar/{codLugarVoto}")
    @ResponseStatus(HttpStatus.CREATED)
    public TablaLugarVoto update(@RequestBody LugarVotoDto lugarVotoDto, @PathVariable String codLugarVoto){
        TablaLugarVoto lugarVoto=lugarVotoService.findById(codLugarVoto);
        lugarVoto.setNombreLugar(lugarVotoDto.getNombreLugar());
        lugarVoto.setDireccionVoto(lugarVotoDto.getDireccionVoto());
        lugarVoto.setCod_Ciudad(ciudadService.findById(lugarVotoDto.getCiudad()));
        return lugarVotoService.create(lugarVoto);
    }

    @DeleteMapping("/lugar/{codLugarVoto}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String codLugarVoto){
        lugarVotoService.delete(codLugarVoto);
    }
    
}
