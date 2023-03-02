
package com.Pro_Clinica_Veterinaria.demo.repo;

import com.Pro_Clinica_Veterinaria.demo.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepo  extends JpaRepository <Empleado, Integer> {
    
    
    
}
