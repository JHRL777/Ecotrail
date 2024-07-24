package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.domain.Clave;
import java.util.List;

public interface ClaveService {

    public List<Clave> listarClave();
    public void guardar (Clave clave);
    public void eliminar (Clave clave);
    public Clave buscar (Clave clave);

}
