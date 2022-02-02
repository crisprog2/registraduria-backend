package org.spring.registraduria.backend.registraduriabackend.model.services;

import org.spring.registraduria.backend.registraduriabackend.model.dao.IRegistroDao;
import org.spring.registraduria.backend.registraduriabackend.model.entities.TablaRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroServiceImpl implements IRegistroService {
    @Autowired
    private IRegistroDao iRegistroDao;

    @Override
    public void save(TablaRegistro registro) {
        iRegistroDao.save(registro);
    }
}
