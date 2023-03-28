package com.Pro_Clinica_Veterinaria.demo.controller;

import com.Pro_Clinica_Veterinaria.demo.entity.Especie;
import com.Pro_Clinica_Veterinaria.demo.services.EspecieService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Especie")
public class EspecieController {

    private static final Logger log = (Logger) org.slf4j.LoggerFactory.getLogger(Especie.class);

    @Autowired
    private EspecieService especieService;

    @GetMapping({"/listar"})
    public String listar(Model modelo) {
        modelo.addAttribute("especies", especieService.findAll());
        return "VerEspecie";
    }

    @GetMapping("/crear")
    public String agregar() {
        return "AgregarEspecie";
    }

    @PostMapping("/guardar")
    public String guardar(Especie especie) {
        especieService.save(especie);
        return "redirect:/Especie/listar";
    }

    @GetMapping("/editar/{id}")
    public String edit(@PathVariable(value = "id") Integer id, Model modelo) {
        Especie e = (Especie) especieService.findOne(id);
        log.info("Objeto recuperado {}", e);
        modelo.addAttribute("especie", e);
        return "DetallesEspecies";
    }

    @GetMapping("/eliminar/{id}")
    public String edit(@PathVariable(value = "id") Integer id) {
        Especie e = (Especie) especieService.findOne(id);
        log.info("Objeto recuperado {}", e);
        especieService.delete(id);
        return "redirect:/Especie/listar";
    }
}
