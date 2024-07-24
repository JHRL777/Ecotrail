package com.talentotech.EcoTrail.Service;

import com.talentotech.EcoTrail.domain.ActividadTuristica;
import java.util.List;

public interface ActividadTuristicaService {

    public List<ActividadTuristica> listarActividadTuristica();
    public void guardar (ActividadTuristica actividadTuristica);
    public void eliminar (ActividadTuristica actividadTuristica);
    public ActividadTuristica buscar (Integer id);
    public int totalActividades();
    public int totalActividadesBoyaca();
    public int totalActividadesCundinamarca();
    public List<ActividadTuristica> listarActividadTuristicaBoyaca();
    public List<ActividadTuristica> listarActividadTuristicaCundinamarca();
}