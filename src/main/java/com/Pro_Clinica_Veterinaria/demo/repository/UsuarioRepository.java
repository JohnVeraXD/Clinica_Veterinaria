/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Pro_Clinica_Veterinaria.demo.repository;

import com.Pro_Clinica_Veterinaria.demo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    Usuario findByNombreUsuario(String nombreUsuario); 
}
