package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.DAO.MunicipioDao;
import com.talentotech.EcoTrail.domain.Municipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MunicipioServiceImpl implements MunicipioService{
    @Autowired
    MunicipioDao municipioDao;
    @Override
    @Transactional(readOnly = true)
    public List<Municipio> listarMunicipio() {
        return  (List<Municipio>) municipioDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Municipio municipio) {
        municipioDao.save(municipio);
    }

    @Override
    @Transactional
    public void eliminar(Municipio municipio) {
        municipioDao.delete(municipio);
    }

    @Override
    @Transactional(readOnly = true)
    public Municipio buscar(Municipio municipio) {
        return municipioDao.findById(municipio.getId_municipio()).orElse(null);
    }
}