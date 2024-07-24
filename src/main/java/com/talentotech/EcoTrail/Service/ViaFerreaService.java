package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.domain.ViaFerrea;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ViaFerreaService {
    public List<ViaFerrea> listarViaFerrea();
    public void guardar (ViaFerrea viaFerrea);
    public void eliminar (ViaFerrea viaFerrea);
    public ViaFerrea buscar (ViaFerrea viaFerrea);
    public int totalVias();
    int totalViasBoyaca();
    int totalViasCundinamarca();

    public int totalViasActivas();
    int totalViasActivasBoyaca();
    int totalViasActivasCundinamarca();
}