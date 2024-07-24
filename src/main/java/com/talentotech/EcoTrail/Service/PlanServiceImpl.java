package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.DAO.PlanDao;
import com.talentotech.EcoTrail.domain.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService{

    @Autowired
    PlanDao planDao;
    @Override
    @Transactional(readOnly = true)
    public List<Plan> listarPlan() {
        return (List<Plan>) planDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Plan plan) {
        planDao.save(plan);
    }

    @Override
    @Transactional
    public void eliminar(Plan plan) {
        planDao.delete(plan);
    }

    @Override
    @Transactional(readOnly = true)
    public Plan buscar(Plan plan) {
        return planDao.findById(plan.getId_plan()).orElse(null);
    }
}