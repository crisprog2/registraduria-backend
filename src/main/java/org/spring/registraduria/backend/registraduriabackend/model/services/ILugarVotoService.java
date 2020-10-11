package org.spring.registraduria.backend.registraduriabackend.model.services;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaLugarVoto;

public interface ILugarVotoService {
    
public List<TablaLugarVoto> findAll();

}
