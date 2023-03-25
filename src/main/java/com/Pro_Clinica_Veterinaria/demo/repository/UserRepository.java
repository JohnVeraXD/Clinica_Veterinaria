
package com.Pro_Clinica_Veterinaria.demo.repository;

import com.Pro_Clinica_Veterinaria.demo.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {

    public Usuario findByNombreUsuarioAndContrasenia(String nombreUsuario,String contrasenia);
    
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);

}
