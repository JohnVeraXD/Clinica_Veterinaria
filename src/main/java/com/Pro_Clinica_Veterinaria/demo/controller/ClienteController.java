package com.Pro_Clinica_Veterinaria.demo.controller;

import com.Pro_Clinica_Veterinaria.demo.entity.Cliente;
import com.Pro_Clinica_Veterinaria.demo.services.ClienteService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Cliente")
public class ClienteController {

    private static final Logger log = (Logger) org.slf4j.LoggerFactory.getLogger(Cliente.class);

    @Autowired
    private ClienteService clienteService;

    @GetMapping({"/listar"})
    public String listar(Model modelo) {
        modelo.addAttribute("clientes", clienteService.findAll());
        return "VerCliente";
    }

    @GetMapping("/crear")
    public String agregar() {
        return "AgregarCliente";
    }

    @PostMapping("/guardar")
    public String guardar(Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/Cliente/listar";
    }

    @GetMapping("/editar/{id}")
    public String edit(@PathVariable(value = "id") Integer id, Model modelo) {
        Cliente c = clienteService.findOne(id);
        log.info("Objeto recuperado {}", c);
        modelo.addAttribute("cliente", c);
        return "DetallesClientes";
    }

    @GetMapping("/eliminar/{id}")
    public String edit(@PathVariable(value = "id") Integer id) {
        Cliente c = clienteService.findOne(id);
        log.info("Objeto recuperado {}", c);
        clienteService.delete(id);
        return "redirect:/Cliente/listar";
    }

}
