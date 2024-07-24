package com.talentotech.EcoTrail.web;

import com.talentotech.EcoTrail.Service.ActividadTuristicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorMapa {

    @Autowired
    private ActividadTuristicaService actividadTuristicaService;

    @GetMapping("/Maps.html")
    public String map(){
        return "Maps";
    }

}