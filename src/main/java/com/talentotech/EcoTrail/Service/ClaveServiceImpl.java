package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.DAO.ClaveDao;
import com.talentotech.EcoTrail.domain.Clave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClaveServiceImpl implements ClaveService{

    @Autowired
    private ClaveDao claveDao;
    @Override
    @Transactional(readOnly = true)
    public List<Clave> listarClave() {
        return (List<Clave>) claveDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Clave clave) {
        claveDao.save(clave);
    }

    @Override
    @Transactional
    public void eliminar(Clave clave) {
        claveDao.delete(clave);
    }

    @Override
    @Transactional(readOnly = true)
    public Clave buscar(Clave clave) {
        return claveDao.findById(clave.getId_clave()).orElse(null);
    }
}
