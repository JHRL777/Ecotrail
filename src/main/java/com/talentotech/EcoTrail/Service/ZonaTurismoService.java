package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.domain.ZonaTurismo;

import java.util.List;

public interface ZonaTurismoService {
    public List<ZonaTurismo> listarZonaTurismo();
    public void guardar (ZonaTurismo zonaTurismo);
    public void eliminar (ZonaTurismo zonaTurismo);
    public ZonaTurismo buscar (ZonaTurismo zonaTurismo);
}
