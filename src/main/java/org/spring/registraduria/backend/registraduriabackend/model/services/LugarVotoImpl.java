package org.spring.registraduria.backend.registraduriabackend.model.services;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.dao.ILugarVotoDao;
import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaLugarVoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LugarVotoImpl implements ILugarVotoService {

    @Autowired
    private ILugarVotoDao lugarVotoDao;

    @Override
    @Transactional(readOnly = true)
    public List<TablaLugarVoto> findAll() {
        return (List<TablaLugarVoto>) lugarVotoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TablaLugarVoto findById(String codLugarVoto) {
        return lugarVotoDao.findById(codLugarVoto).orElse(null);
    }

    @Override
    @Transactional
    public TablaLugarVoto create(TablaLugarVoto lugarVoto) {
        return lugarVotoDao.save(lugarVoto);
    }

    @Override
    public void delete(String codLugarVoto) {
        lugarVotoDao.deleteById(codLugarVoto);
    }
    
}
