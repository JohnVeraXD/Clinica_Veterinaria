
package com.Pro_Clinica_Veterinaria.demo.controller;

import com.Pro_Clinica_Veterinaria.demo.entity.Paciente;
import com.Pro_Clinica_Veterinaria.demo.services.PacienteService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Paciente")
public class PacienteController {
    private static final Logger log = (Logger) org.slf4j.LoggerFactory.getLogger(Paciente.class);

    @Autowired
    private PacienteService pacienteService;

    @GetMapping({"/listar"})
    public String listar(Model modelo) {
        modelo.addAttribute("pacientes", pacienteService.findAll());
        return "VerPaciente";
    }

    @GetMapping("/crear")
    public String agregar() {
        return "AgregarPaciente";
    }

    @PostMapping("/guardar")
    public String guardar(Paciente paciente) {
        pacienteService.save(paciente);
        return "redirect:/Paciente/listar";
    }

    @GetMapping("/editar/{id}")
    public String edit(@PathVariable(value = "id") Integer id, Model modelo) {
        Paciente p = (Paciente) pacienteService.findOne(id);
        log.info("Objeto recuperado {}", p);
        modelo.addAttribute("paciente", p);
        return "DetallesPacientes";
    }

    @GetMapping("/eliminar/{id}")
    public String edit(@PathVariable(value = "id") Integer id) {
        Paciente p = (Paciente) pacienteService.findOne(id);
        log.info("Objeto recuperado {}", p);
        pacienteService.delete(id);
        return "redirect:/Paciente/listar";
    }
}
