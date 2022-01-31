package org.spring.registraduria.backend.registraduriabackend.model.services;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaMesa;

public interface IMesaService {

    public List<TablaMesa> findAll();
    public TablaMesa create(TablaMesa mesa);
    public TablaMesa findById(Long codMesa);
    public void delete(Long codMesa);
    
}
