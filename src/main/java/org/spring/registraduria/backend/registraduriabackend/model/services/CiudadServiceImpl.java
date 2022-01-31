package org.spring.registraduria.backend.registraduriabackend.model.services;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.dao.ICiudadDao;
import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaCiudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CiudadServiceImpl implements ICiudadService {

    @Autowired
    private ICiudadDao ciudadDao;

    @Override
    @Transactional(readOnly = true)
    public List<TablaCiudad> findAll() {
        return (List<TablaCiudad>) ciudadDao.findAll();
    }

    @Override
    @Transactional
    public TablaCiudad create(TablaCiudad ciudad) {
        return ciudadDao.save(ciudad);
    }

    @Override
    @Transactional(readOnly = true)
    public TablaCiudad findById(String codCiudad) {
        return ciudadDao.findById(codCiudad).orElse(null);
    }

    @Override
    @Transactional
    public void delete(String codCiudad) {
        ciudadDao.deleteById(codCiudad); 
    }
    
}
