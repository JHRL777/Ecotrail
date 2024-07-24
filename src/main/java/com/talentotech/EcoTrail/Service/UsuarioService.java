package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.domain.Usuario;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> listarUsuario();
    public void guardar (Usuario usuario);
    public void eliminar (Usuario usuario);
    public  Usuario buscar(Integer id);
}