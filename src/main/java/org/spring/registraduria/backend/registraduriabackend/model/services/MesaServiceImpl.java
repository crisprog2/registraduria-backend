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
        return (List<TablaMesa>) mesaDao.findAll();
    }

    @Override
    @Transactional
    public TablaMesa create(TablaMesa mesa) {
        return mesaDao.save(mesa);
    }

    @Override
    @Transactional(readOnly = true)
    public TablaMesa findById(Long codMesa) {
        return mesaDao.findById(codMesa).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long codMesa) {
        mesaDao.deleteById(codMesa);
    }
    
}
