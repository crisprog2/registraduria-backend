package org.spring.registraduria.backend.registraduriabackend.model.services;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaDepartamento;

public interface IDepartamentoService {

    public List<TablaDepartamento> findAll();

    public TablaDepartamento findById(String codDepartamento);

    public TablaDepartamento create(TablaDepartamento departamento);

    public void delete(String codDepartamento);

}
