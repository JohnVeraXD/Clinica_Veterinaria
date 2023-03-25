/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pro_Clinica_Veterinaria.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "Usuario")
@Data
@NoArgsConstructor
public class Usuario{
     
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     
    @Column(name = "idEmpleado", nullable = true, unique = false) 
    private int idEmpleado; 
 
    @Column(name = "nombreUsuario", nullable = true, unique = false, length = 30) 
    private String nombreUsuario; 
 
    @Column(name = "contrasenia", nullable = true, unique = false, length = 30) 
    private String contrasenia; 
 
    @Column(name = "role", nullable = true, unique = false, length = 30) 
    private String role; 
 
    @Column(name = "estado", nullable = true, unique = false) 
    private int estado; 
 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
     public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
     public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
     public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
     public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public int getEstado() {
        return estado;
    }

    public void setEstado (int estado) {
        this.estado = estado;
    }
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null ) ? 0 : this.id.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "com.app.tddt4iots.entities.Usuario[ id=" + id + " ]";
    }
}    