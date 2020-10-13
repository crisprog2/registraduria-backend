package org.spring.registraduria.backend.registraduriabackend.model.services;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.dao.ILugarVotoDao;
import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaLugarVoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LugarVotoImpl implements ILugarVotoService {

    @Autowired
    private ILugarVotoDao lugarVotoDao;

    @Override
    public List<TablaLugarVoto> findAll() {
        // TODO Auto-generated method stub
        return (List<TablaLugarVoto>) lugarVotoDao.findAll();
    }
    
}
