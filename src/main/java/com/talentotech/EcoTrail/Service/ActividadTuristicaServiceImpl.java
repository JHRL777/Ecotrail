package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.DAO.ActividadTuristicaDao;
import com.talentotech.EcoTrail.domain.ActividadTuristica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActividadTuristicaServiceImpl implements ActividadTuristicaService{

    @Autowired
    private ActividadTuristicaDao actividadTuristicaDao;
    @Override
    @Transactional(readOnly = true)
    public List<ActividadTuristica> listarActividadTuristica() {
        return (List<ActividadTuristica>) actividadTuristicaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(ActividadTuristica actividadTuristica) {
        actividadTuristicaDao.save(actividadTuristica);
    }

    @Override
    @Transactional
    public void eliminar(ActividadTuristica actividadTuristica) {
        actividadTuristicaDao.delete(actividadTuristica);
    }

    @Override
    @Transactional(readOnly = true)
    public ActividadTuristica buscar(Integer id) {
        return actividadTuristicaDao.findById(id).orElse(null);
    }
    @Override
    @Transactional (readOnly = true)
    public int totalActividades() {
        ArrayList<ActividadTuristica> lista = (ArrayList<ActividadTuristica>) actividadTuristicaDao.findAll();
        int total=lista.size();
        return total;
    }
    @Override
    @Transactional (readOnly = true)
    public int totalActividadesBoyaca() {
        int total=0;
        ArrayList<ActividadTuristica> lista = (ArrayList<ActividadTuristica>) actividadTuristicaDao.findAll();
        for(ActividadTuristica actividadTuristica: lista){
            if(actividadTuristica.getZona().getMunicipio().getDepartamento().getId_departamento()==1){
                total+=1;
            }
        }
        return total;
    }
    @Override
    @Transactional (readOnly = true)
    public int totalActividadesCundinamarca() {
        int total=0;
        ArrayList<ActividadTuristica> lista = (ArrayList<ActividadTuristica>) actividadTuristicaDao.findAll();
        for(ActividadTuristica actividadTuristica: lista){
            if(actividadTuristica.getZona().getMunicipio().getDepartamento().getId_departamento()==2){
                total+=1;
            }
        }
        return total;
    }
    @Override
    @Transactional(readOnly = true)
    public List<ActividadTuristica> listarActividadTuristicaBoyaca() {
        ArrayList<ActividadTuristica> lista = (ArrayList<ActividadTuristica>) actividadTuristicaDao.findAll();
        lista.removeIf(actividadTuristica ->
                actividadTuristica.getZona().getMunicipio().getDepartamento().getId_departamento() == 2);
        return lista;
    }
    @Override
    @Transactional(readOnly = true)
    public List<ActividadTuristica> listarActividadTuristicaCundinamarca() {
        ArrayList<ActividadTuristica> lista = (ArrayList<ActividadTuristica>) actividadTuristicaDao.findAll();
        lista.removeIf(actividadTuristica ->
                actividadTuristica.getZona().getMunicipio().getDepartamento().getId_departamento() == 1);
        return lista;
    }
}