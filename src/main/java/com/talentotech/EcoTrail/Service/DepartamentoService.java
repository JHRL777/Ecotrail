package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.domain.Departamento;

import java.util.List;

public interface DepartamentoService {
    public List<Departamento> listarDepartamento();
    public void guardar (Departamento departamento);
    public void eliminar (Departamento departamento);
    public Departamento buscar (Departamento departamento);
}
