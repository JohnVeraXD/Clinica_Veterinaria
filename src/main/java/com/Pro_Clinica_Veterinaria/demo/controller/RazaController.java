package com.Pro_Clinica_Veterinaria.demo.controller;

import com.Pro_Clinica_Veterinaria.demo.entity.Raza;
import com.Pro_Clinica_Veterinaria.demo.services.RazaService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Raza")
public class RazaController {

    private static final Logger log = (Logger) org.slf4j.LoggerFactory.getLogger(Raza.class);

    @Autowired
    private RazaService razaService;

    @GetMapping({"/listar"})
    public String listar(Model modelo) {
        modelo.addAttribute("clientes", razaService.findAll());
        return "VerCliente";
    }

    @GetMapping("/crear")
    public String agregar() {
        return "AgregarCliente";
    }

    @PostMapping("/guardar")
    public String guardar(Raza raza) {
        razaService.save(raza);
        return "redirect:/Cliente/listar";
    }

    @GetMapping("/editar/{id}")
    public String edit(@PathVariable(value = "id") Integer id, Model modelo) {
        Raza r = razaService.findOne(id);
        log.info("Objeto recuperado {}", r);
        modelo.addAttribute("cliente", r);
        return "DetallesClientes";
    }

    @GetMapping("/eliminar/{id}")
    public String edit(@PathVariable(value = "id") Integer id) {
        Raza r = razaService.findOne(id);
        log.info("Objeto recuperado {}", r);
        razaService.delete(id);
        return "redirect:/Cliente/listar";
    }
}
