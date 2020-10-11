package org.spring.registraduria.backend.registraduriabackend.model.services;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.dao.ICiudadDao;
import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaCiudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadServiceImpl implements ICiudadService {

    @Autowired
    private ICiudadDao ciudadDao;

    @Override
    public List<TablaCiudad> findAll() {
        // TODO Auto-generated method stub
        return (List<TablaCiudad>) ciudadDao.findAll();
    }
    
}
