package com.talentotech.EcoTrail.DAO;

import com.talentotech.EcoTrail.domain.Departamento;
import org.springframework.data.repository.CrudRepository;

public interface DepartamentoDao extends CrudRepository<Departamento,Integer> {
}