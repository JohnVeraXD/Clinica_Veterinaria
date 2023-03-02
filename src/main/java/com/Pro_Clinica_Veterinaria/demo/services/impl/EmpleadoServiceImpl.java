/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pro_Clinica_Veterinaria.demo.services.impl;

import com.Pro_Clinica_Veterinaria.demo.repo.EmpleadoRepo;
import com.Pro_Clinica_Veterinaria.demo.services.EmpleadoService;
import com.Pro_Clinica_Veterinaria.demo.entity.Empleado;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

    
    private EmpleadoRepo empleadorepo;
    
    public EmpleadoServiceImpl(EmpleadoRepo empleadorepo) {
        super();
        this.empleadorepo = empleadorepo;
    }
    
    @Override
    public List<Empleado> getAllEmpleado(){
        //Todo Auto-generated method Empleado
        return empleadorepo.findAll();
    }
}
