package org.spring.registraduria.backend.registraduriabackend.model.services;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaCiudad;

public interface ICiudadService {

    public List<TablaCiudad> findAll();
    public TablaCiudad create(TablaCiudad ciudad);
    
}
