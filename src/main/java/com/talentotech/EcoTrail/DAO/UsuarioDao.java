package com.talentotech.EcoTrail.DAO;

import com.talentotech.EcoTrail.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario,Integer> {
}