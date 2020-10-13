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
        // TODO Auto-generated method stub
        return (List<TablaCiudad>) ciudadDao.findAll();
    }

    @Override
    @Transactional
    public TablaCiudad create(TablaCiudad ciudad) {
        // TODO Auto-generated method stub
        return ciudadDao.save(ciudad);
    }
    
}
