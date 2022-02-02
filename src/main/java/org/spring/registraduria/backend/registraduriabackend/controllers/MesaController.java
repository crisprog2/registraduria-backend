package org.spring.registraduria.backend.registraduriabackend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.dtos.MesaVotoDto;
import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaMesa;
import org.spring.registraduria.backend.registraduriabackend.model.services.ILugarVotoService;
import org.spring.registraduria.backend.registraduriabackend.model.services.IMesaService;
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
public class MesaController {
    
    @Autowired
    private IMesaService mesaService;

    @Autowired
    private ILugarVotoService lugarVotoService;

    @GetMapping("/mesas")
    public List<MesaVotoDto> index(){
        List<TablaMesa> tablaMesas=mesaService.findAll();
        List<MesaVotoDto> mesaVotoDtos=new ArrayList<MesaVotoDto>();
        for (TablaMesa tablaMesa : tablaMesas) {
            MesaVotoDto mesaVotoDto=new MesaVotoDto();
            mesaVotoDto.setCodMesa(tablaMesa.getCodMesa());
            mesaVotoDto.setMesa(tablaMesa.getMesa());
            mesaVotoDto.setLugar(tablaMesa.getCod_lugar().getNombreLugar());
            mesaVotoDtos.add(mesaVotoDto);
        }
        return mesaVotoDtos;
    }

    @PostMapping("/mesa")
    @ResponseStatus(HttpStatus.CREATED)
    public TablaMesa create(@RequestBody MesaVotoDto mesaVotoDto){
        TablaMesa tablaMesa=new TablaMesa();
        tablaMesa.setCodMesa(mesaVotoDto.getCodMesa());
        tablaMesa.setMesa(mesaVotoDto.getMesa());
        tablaMesa.setCod_lugar(lugarVotoService.findById(mesaVotoDto.getLugar()));
        return mesaService.create(tablaMesa);
    }

    @GetMapping("/mesa/{codMesa}")
    public MesaVotoDto show(@PathVariable Long codMesa){
        MesaVotoDto mesaVotoDto=new MesaVotoDto();
        TablaMesa tablaMesa=mesaService.findById(codMesa);
        if (tablaMesa!=null) {
            mesaVotoDto.setCodMesa(tablaMesa.getCodMesa());
            mesaVotoDto.setMesa(tablaMesa.getMesa());
            mesaVotoDto.setLugar(tablaMesa.getCod_lugar().getNombreLugar());
        } else {
            mesaVotoDto=null;
        }
        return mesaVotoDto;
    }

    @PutMapping("/mesa/{codMesa}")
    @ResponseStatus(HttpStatus.CREATED)
    public TablaMesa update(@RequestBody MesaVotoDto mesaVotoDto, @PathVariable Long codMesa){
        TablaMesa tablaMesa=mesaService.findById(codMesa);
        tablaMesa.setMesa(mesaVotoDto.getMesa());
        tablaMesa.setCod_lugar(lugarVotoService.findById(mesaVotoDto.getLugar()));
        return mesaService.create(tablaMesa);
    }

    @DeleteMapping("/mesa/{codMesa}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long codMesa){
        mesaService.delete(codMesa);
    }
}
