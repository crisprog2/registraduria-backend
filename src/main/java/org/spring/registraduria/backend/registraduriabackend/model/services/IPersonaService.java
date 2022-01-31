package org.spring.registraduria.backend.registraduriabackend.model.services;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaPersona;

public interface IPersonaService {

    public List<TablaPersona> findAll();
    public TablaPersona findById(Integer idPersona);
    public TablaPersona create(TablaPersona tablaPersona);
    public void delete(Integer idPersona);
    
}
