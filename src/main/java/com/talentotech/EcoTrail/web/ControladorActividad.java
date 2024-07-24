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
public class ControladorActividad {
    @Autowired
    DepartamentoService departamentoService;
    @Autowired
    ViaFerreaService viaFerreaService;
    @Autowired
    ActividadTuristicaService actividadTuristicaService;
    @Autowired
    RegDeforestService regDeforestService;

    @GetMapping("/Actividades.html")
    public String department(Model model){
        model.addAttribute("totalVias",viaFerreaService.totalVias());
        model.addAttribute("totalViasActivas",viaFerreaService.totalViasActivas());
        model.addAttribute("totalActividades",actividadTuristicaService.totalActividades());
        model.addAttribute("totalDeforestacion",regDeforestService.totalDeforestacion());
        model.addAttribute("listaActividades",actividadTuristicaService.listarActividadTuristica());
        return "Actividades";
    }
}