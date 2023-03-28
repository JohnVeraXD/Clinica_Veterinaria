package com.Pro_Clinica_Veterinaria.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "idEmpleado", nullable = true, unique = false)
    private Integer idEmpleado;

    @ManyToOne
    @JoinColumn(name = "idEmpleado", referencedColumnName = "id", insertable = false, updatable = false)
    private Empleado empleado;

    @Column(name = "nombreUsuario", nullable = true, unique = false, length = 30)
    private String nombreUsuario;

    @Column(name = "contrasenia", nullable = true, unique = false, length = 30)
    private String contrasenia;

    @Column(name = "role", nullable = true, unique = false, length = 30)
    private String role;

    @Column(name = "estado", nullable = true, unique = false, length = 10)
    @ColumnDefault("'Activo'")
    private String estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario() {
    }

    public Usuario(Integer id, int idEmpleado, String nombreUsuario, String contrasenia, String role, String estado) {
        this.id = id;
        this.idEmpleado = idEmpleado;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.role = role;
        this.estado = estado;
    }

    public Usuario(Integer id, int idEmpleado, String nombreUsuario, String contrasenia, String role) {
        this.id = id;
        this.idEmpleado = idEmpleado;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.role = role;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
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

}
