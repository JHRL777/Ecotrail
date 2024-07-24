package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.domain.Municipio;

import java.util.List;

public interface MunicipioService {
    public List<Municipio> listarMunicipio();
    public void guardar (Municipio municipio);
    public void eliminar (Municipio municipio);
    public Municipio buscar (Municipio municipio);
}
