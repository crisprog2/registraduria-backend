package org.spring.registraduria.backend.registraduriabackend.model.services;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.dao.IPersonaDao;
import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;

    @Override
    @Transactional(readOnly = true)
    public List<TablaPersona> findAll() {
        // TODO Auto-generated method stub
        return (List<TablaPersona>) personaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TablaPersona findOne(Integer idPersona) {
        // TODO Auto-generated method stub
        return personaDao.findById(idPersona).orElse(null);
    }
    
}
