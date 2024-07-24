package com.talentotech.EcoTrail.web;

import com.talentotech.EcoTrail.Service.ActividadTuristicaService;
import com.talentotech.EcoTrail.Service.DepartamentoService;
import com.talentotech.EcoTrail.Service.RegDeforestService;
import com.talentotech.EcoTrail.Service.ViaFerreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorCundinamarca {
    @Autowired
    DepartamentoService departamentoService;
    @Autowired
    ViaFerreaService viaFerreaService;
    @Autowired
    ActividadTuristicaService actividadTuristicaService;
    @Autowired
    RegDeforestService regDeforestService;

    @GetMapping("/Cundinamarca.html")
    public String department(Model model){
        model.addAttribute("totalVias",viaFerreaService.totalViasCundinamarca());
        model.addAttribute("totalViasActivas",viaFerreaService.totalViasActivasCundinamarca());
        model.addAttribute("totalActividades",actividadTuristicaService.totalActividadesCundinamarca());
        model.addAttribute("listaActividades",actividadTuristicaService.listarActividadTuristicaCundinamarca());
        model.addAttribute("totalDeforestacion",regDeforestService.totalDeforestacionCundinamarca());
        return "Cundinamarca";
    }
}