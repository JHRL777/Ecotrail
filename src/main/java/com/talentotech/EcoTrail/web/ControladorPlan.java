package com.talentotech.EcoTrail.web;

import com.talentotech.EcoTrail.Service.ActividadTuristicaService;
import com.talentotech.EcoTrail.Service.PlanService;
import com.talentotech.EcoTrail.Service.UsuarioService;
import com.talentotech.EcoTrail.domain.ActividadTuristica;
import com.talentotech.EcoTrail.domain.Plan;
import com.talentotech.EcoTrail.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class ControladorPlan {
    @Autowired
    private PlanService planService;
    @Autowired
    private ActividadTuristicaService actividadTuristicaService;
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/ModificarPlan.html")//como plan puede estar vacio lo paso como parametro
    public String agregarPlan(Plan plan, Model model){
        List<ActividadTuristica> actividades = actividadTuristicaService.listarActividadTuristica();
        model.addAttribute("actividades", actividades);
        return "ModificarPlan";
    }
    @PostMapping("/GuardarPlan")//create
    public String guardarPlan(Plan plan){
        Usuario usuario = usuarioService.buscar(1);
        plan.setUsuario(usuario);
        planService.guardar(plan);
        return "redirect:/Plan.html";
    }
    @GetMapping("/Plan.html")//read
    public String mostrarPlan(Model model) {
        List<Plan> listado_planes = planService.listarPlan();
        model.addAttribute("listado_planes", listado_planes);
        return "Plan";
    }
    @GetMapping("/EditarPlan/{id_plan}")//update
    public String editarPlan(Plan plan, Model model) {
        plan=planService.buscar(plan);
        model.addAttribute("plan",plan);
        List<ActividadTuristica> actividades = actividadTuristicaService.listarActividadTuristica();
        model.addAttribute("actividades", actividades);
        return "ModificarPlan";
    }
    @GetMapping("/EliminarPlan")//delete
    public String eliminarPlan(Plan plan) {
        planService.eliminar(plan);
        return "redirect:/Plan.html";
    }
}