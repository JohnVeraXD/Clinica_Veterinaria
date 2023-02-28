
package Empleadorest.repo;

import com.pro_clinica_veterinaria.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface empleadorepo  extends JpaRepository <Empleado, Integer> {
    
    
    
}
