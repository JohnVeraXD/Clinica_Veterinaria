
package com.Pro_Clinica_Veterinaria.services;

import Empleadorest.repo.empleadorepo;
import com.pro_clinica_veterinaria.entity.Empleado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService  {
    @Autowired
    private empleadorepo empleadorepo;
    
    
    public Empleado insertar(Empleado emp){
    return empleadorepo.save(emp);
    }
    
    public Empleado actualizar (Empleado emp){
        return empleadorepo.save(emp);
    }
    
    
    public List<Empleado> listar(){
        return empleadorepo.findAll();
    }
    
    public void eliminar (Empleado emp){
   empleadorepo.delete(emp);
    }
    
}
