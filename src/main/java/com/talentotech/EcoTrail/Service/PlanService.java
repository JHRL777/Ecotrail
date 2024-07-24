package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.domain.Plan;

import java.util.List;

public interface PlanService {
    public List<Plan> listarPlan();
    public void guardar (Plan plan);
    public void eliminar (Plan plan);
    public Plan buscar (Plan plan);
}