package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.DAO.RegDeforestDao;
import com.talentotech.EcoTrail.domain.RegDeforest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegDeforestServiceImpl implements RegDeforestService{

    @Autowired
    RegDeforestDao regDeforestDao;
    @Override
    @Transactional(readOnly = true)
    public List<RegDeforest> listarRegDeforest() {
        return (List<RegDeforest>) regDeforestDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(RegDeforest regDeforest) {
        regDeforestDao.save(regDeforest);
    }

    @Override
    @Transactional
    public void eliminar(RegDeforest regDeforest) {
        regDeforestDao.delete(regDeforest);
    }

    @Override
    @Transactional(readOnly = true)
    public RegDeforest buscar(RegDeforest regDeforest) {
        return regDeforestDao.findById(regDeforest.getId_reg_def()).orElse(null);
    }
    @Override
    @Transactional (readOnly = true)
    public int totalDeforestacion() {
        int total=0;
        ArrayList<RegDeforest> lista = (ArrayList<RegDeforest>) regDeforestDao.findAll();
        for(RegDeforest regDeforest: lista){
            total+=regDeforest.getImpacto();
        }

        return total;
    }
    @Override
    @Transactional (readOnly = true)
    public int totalDeforestacionBoyaca() {
        int total=0;
        ArrayList<RegDeforest> lista = (ArrayList<RegDeforest>) regDeforestDao.findAll();
        for(RegDeforest regDeforest: lista){
            if (regDeforest.getMunicipio().getDepartamento().getId_departamento()==1){
                total+=regDeforest.getImpacto();
            }
        }
        return total;
    }
    @Override
    @Transactional (readOnly = true)
    public int totalDeforestacionCundinamarca() {
        int total=0;
        ArrayList<RegDeforest> lista = (ArrayList<RegDeforest>) regDeforestDao.findAll();
        for(RegDeforest regDeforest: lista){
            if (regDeforest.getMunicipio().getDepartamento().getId_departamento()==2){
                total+=regDeforest.getImpacto();
            }
        }
        return total;
    }

}
