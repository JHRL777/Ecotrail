package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.DAO.ViaFerreaDao;
import com.talentotech.EcoTrail.domain.ViaFerrea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ViaFerreaServiceImpl implements ViaFerreaService{
    @Autowired
    ViaFerreaDao viaFerreaDao;
    @Override
    @Transactional (readOnly = true)
    public List<ViaFerrea> listarViaFerrea() {
        return (List<ViaFerrea>) viaFerreaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(ViaFerrea viaFerrea) {
        viaFerreaDao.save(viaFerrea);
    }

    @Override
    @Transactional
    public void eliminar(ViaFerrea viaFerrea) {
        viaFerreaDao.delete(viaFerrea);
    }

    @Override
    @Transactional (readOnly = true)
    public ViaFerrea buscar(ViaFerrea viaFerrea) {
        return viaFerreaDao.findById(viaFerrea.getId_viaf()).orElse(null);
    }

    @Override
    @Transactional (readOnly = true)
    public int totalVias( ) {
        int total=0;
        ArrayList<ViaFerrea> lista = (ArrayList<ViaFerrea>) viaFerreaDao.findAll();
        for (ViaFerrea viaFerrea : lista) {
            total += viaFerrea.getDistancia();
        }
        return total;
    }
    @Override
    @Transactional (readOnly = true)
    public int totalViasBoyaca() {
        int total=0;
        ArrayList<ViaFerrea> lista = (ArrayList<ViaFerrea>) viaFerreaDao.findAll();
        for (ViaFerrea viaFerrea : lista) {
            if (viaFerrea.getMunicipio().getDepartamento().getId_departamento()==1){
                total += viaFerrea.getDistancia();
            }

        }
        return total;
    }
    @Override
    @Transactional (readOnly = true)
    public int totalViasCundinamarca() {
        int total=0;
        ArrayList<ViaFerrea> lista = (ArrayList<ViaFerrea>) viaFerreaDao.findAll();
        for (ViaFerrea viaFerrea : lista) {
            if (viaFerrea.getMunicipio().getDepartamento().getId_departamento()==2){
                total += viaFerrea.getDistancia();
            }

        }
        return total;
    }
    @Override
    @Transactional (readOnly = true)
    public int totalViasActivas() {
        int total=0;
        ArrayList<ViaFerrea> lista = (ArrayList<ViaFerrea>) viaFerreaDao.findAll();
        for (ViaFerrea viaFerrea : lista) {
            if (viaFerrea.getEstado().equals("activa")) {
                total += viaFerrea.getDistancia();
            }
        }
        return total;
    }
    @Override
    @Transactional (readOnly = true)
    public int totalViasActivasBoyaca() {
        int total=0;
        ArrayList<ViaFerrea> lista = (ArrayList<ViaFerrea>) viaFerreaDao.findAll();
        for (ViaFerrea viaFerrea : lista) {
            if (viaFerrea.getEstado().equals("activa") && viaFerrea.getMunicipio().getDepartamento().getId_departamento()==1 ) {
                total += viaFerrea.getDistancia();
            }
        }
        return total;
    }
    @Override
    @Transactional (readOnly = true)
    public int totalViasActivasCundinamarca() {
        int total=0;
        ArrayList<ViaFerrea> lista = (ArrayList<ViaFerrea>) viaFerreaDao.findAll();
        for (ViaFerrea viaFerrea : lista) {
            if (viaFerrea.getEstado().equals("activa") && viaFerrea.getMunicipio().getDepartamento().getId_departamento()==2 ) {
                total += viaFerrea.getDistancia();
            }
        }
        return total;
    }

}