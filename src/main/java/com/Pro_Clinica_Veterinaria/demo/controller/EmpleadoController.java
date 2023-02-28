
package com.Pro_Clinica_Veterinaria.demo.controller;

import com.Pro_Clinica_Veterinaria.services.EmpleadoService;
import com.pro_clinica_veterinaria.entity.Empleado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Empleado")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoservices;
    
    
    @GetMapping
    public List<Empleado> listtar(){
        return empleadoservices.listar();
    }
    
   
    @PostMapping
    public Empleado insertar( @RequestBody Empleado emp){
    return empleadoservices.insertar(emp);
    }
    
    @PutMapping
    public Empleado actualizar(@RequestBody Empleado emp ){
    return empleadoservices.actualizar(emp);
    }
    
    
    @DeleteMapping
    public void eliminar(@RequestBody Empleado emp){
        empleadoservices.eliminar(emp);
    }
    
}
