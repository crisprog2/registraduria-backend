package org.spring.registraduria.backend.registraduriabackend.model.services;

import java.util.List;

import org.spring.registraduria.backend.registraduriabackend.model.dao.IMesaDao;
import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaMesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MesaServiceImpl implements IMesaService {

    @Autowired
    private IMesaDao mesaDao;

    @Override
    @Transactional(readOnly = true)
    public List<TablaMesa> findAll() {
        // TODO Auto-generated method stub
        return (List<TablaMesa>) mesaDao.findAll();
    }
    
}
