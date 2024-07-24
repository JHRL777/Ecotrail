package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.DAO.DepartamentoDao;
import com.talentotech.EcoTrail.domain.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{

    @Autowired
    private DepartamentoDao departamentoDao;
    @Override
    @Transactional(readOnly = true)
    public List<Departamento> listarDepartamento() {
        return (List<Departamento>) departamentoDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Departamento departamento) {
        departamentoDao.save(departamento);
    }

    @Override
    @Transactional
    public void eliminar(Departamento departamento) {

        departamentoDao.delete(departamento);
    }

    @Override
    @Transactional(readOnly = true)
    public Departamento buscar(Departamento actividadTuristica) {
        return departamentoDao.findById(actividadTuristica.getId_departamento()).orElse(null);
    }
}
