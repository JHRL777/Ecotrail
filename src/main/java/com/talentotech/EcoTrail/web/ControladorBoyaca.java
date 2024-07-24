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
public class ControladorBoyaca {
    @Autowired
    DepartamentoService departamentoService;
    @Autowired
    ViaFerreaService viaFerreaService;
    @Autowired
    ActividadTuristicaService actividadTuristicaService;
    @Autowired
    RegDeforestService regDeforestService;

    @GetMapping("/Boyaca.html")
    public String department(Model model){
        model.addAttribute("totalVias",viaFerreaService.totalViasBoyaca());
        model.addAttribute("totalViasActivas",viaFerreaService.totalViasActivasBoyaca());
        model.addAttribute("totalActividades",actividadTuristicaService.totalActividadesBoyaca());
        model.addAttribute("listaActividades",actividadTuristicaService.listarActividadTuristicaBoyaca());
        model.addAttribute("totalDeforestacion",regDeforestService.totalDeforestacionBoyaca());
        return "Boyaca";
    }
}