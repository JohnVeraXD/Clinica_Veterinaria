
package com.Pro_Clinica_Veterinaria.demo.services;

import com.Pro_Clinica_Veterinaria.demo.entity.Empleado;
import java.util.List;
/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Pro_Clinica_Veterinaria.repo.EmpleadoRepo;
*/


public interface EmpleadoService  {
    
     List<Empleado> getAllEmpleado();
    
    /*
    @Autowired
    private EmpleadoRepo empleadorepo;
    
    
    public Empleado insertar(Empleado emp){
    return empleadorepo.save(emp);
    }
    
    public Empleado actualizar(Empleado emp){
        return empleadorepo.save(emp);
    }
    
    
    public List<Empleado>listar(){
        return empleadorepo.findAll();
    }
    
    public void eliminar(Empleado emp){
        empleadorepo.delete(emp);
    }
    */
    
    
}
