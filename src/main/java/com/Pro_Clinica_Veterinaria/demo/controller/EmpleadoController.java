
package com.Pro_Clinica_Veterinaria.demo.controller;

import org.springframework.ui.Model;
import com.Pro_Clinica_Veterinaria.demo.services.EmpleadoService;
import com.Pro_Clinica_Veterinaria.demo.entity.Empleado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EmpleadoController {


    
    //@Autowired
    private final EmpleadoService empleadoservice;
    
        
    public EmpleadoController(EmpleadoService empleadoservice) {
        super();
        this.empleadoservice = empleadoservice;
    }
    
    @GetMapping("/empleado")
    public String listEmpleados(Model model){
        model.addAttribute("Empleado", empleadoservice.getAllEmpleado());
        return "Empleado";
    }
    
    
   /*
    @PostMapping
    public Empleado insertar( @RequestBody Empleado emp){
        return empleadoservice.insertar(emp);
    }
    
    @PutMapping
    public Empleado actualizar(@RequestBody Empleado emp ){
        return empleadoservice.actualizar(emp);
    }
    
    
    @DeleteMapping
    public void eliminar(@RequestBody Empleado emp){
        empleadoservice.eliminar(emp);
    }
    
    */
    
}
