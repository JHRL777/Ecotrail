package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.DAO.ZonaTurismoDao;
import com.talentotech.EcoTrail.domain.ZonaTurismo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ZonaTurismoServiceImpl implements ZonaTurismoService {
    @Autowired
    ZonaTurismoDao zonaTurismoDao;
    @Override
    @Transactional (readOnly = true)
    public List<ZonaTurismo> listarZonaTurismo() {
        return (List<ZonaTurismo>) zonaTurismoDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(ZonaTurismo zonaTurismo) {
        zonaTurismoDao.save(zonaTurismo);
    }

    @Override
    @Transactional
    public void eliminar(ZonaTurismo zonaTurismo) {
        zonaTurismoDao.delete(zonaTurismo);
    }

    @Override
    @Transactional (readOnly = true)
    public ZonaTurismo buscar(ZonaTurismo zonaTurismo) {
        return zonaTurismoDao.findById(zonaTurismo.getId_zona()).orElse(null);
    }
}