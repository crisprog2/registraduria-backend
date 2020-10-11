package org.spring.registraduria.backend.registraduriabackend.model.services;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaMesa;

public interface IMesaService {

    public List<TablaMesa> findAll();
    
}
