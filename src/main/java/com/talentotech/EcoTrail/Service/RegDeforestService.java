package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.domain.RegDeforest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface RegDeforestService {
    public List<RegDeforest> listarRegDeforest();
    public void guardar (RegDeforest regDeforest);
    public void eliminar (RegDeforest regDeforest);
    public RegDeforest buscar (RegDeforest regDeforest);
    public int totalDeforestacion();
    public int totalDeforestacionBoyaca();
    public int totalDeforestacionCundinamarca();
}