package org.spring.registraduria.backend.registraduriabackend.model.services;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.dao.IDepartamentoDao;
import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaDepartamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

    @Autowired
    private IDepartamentoDao departamentoDao;

    @Override
    @Transactional(readOnly = true)
    public List<TablaDepartamento> findAll() {
        return (List<TablaDepartamento>) departamentoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TablaDepartamento findById(String codDepartamento) {
        return departamentoDao.findById(codDepartamento).orElse(null);
    }

    @Override
    @Transactional
    public TablaDepartamento create(TablaDepartamento departamento) {
        return departamentoDao.save(departamento);
    }

    @Override
    @Transactional
    public void delete(String codDepartamento) {
        departamentoDao.deleteById(codDepartamento);
    }
    
}
