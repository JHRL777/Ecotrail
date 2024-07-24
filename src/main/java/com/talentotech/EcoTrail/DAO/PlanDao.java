package com.talentotech.EcoTrail.DAO;

import com.talentotech.EcoTrail.domain.Plan;
import org.springframework.data.repository.CrudRepository;

public interface PlanDao extends CrudRepository<Plan,Integer> {
}