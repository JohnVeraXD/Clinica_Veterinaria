package com.Pro_Clinica_Veterinaria.demo.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "Clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombres", nullable = true, unique = false, length = 30)
    private String nombres;

    @Column(name = "apellidos", nullable = true, unique = false, length = 30)
    private String apellidos;

    @Column(name = "direccion", nullable = true, unique = false, length = 50)
    private String direccion;

    @Column(name = "correoElectronico", nullable = false, unique = true, length = 50)
    private String correoElectronico;

    @Column(name = "celular", nullable = true, unique = false, length = 10)
    private String celular;

    @Column(name = "estado", nullable = true, unique = false, length = 30)
    @ColumnDefault("'Activo'")
    private String estado;

    @OneToMany(mappedBy = "cliente")
    private List<Paciente> pacientes;

    public Integer getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getCelular() {
        return celular;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente() {
    }

    public Cliente(Integer id, String nombres, String apellidos, String direccion, String correoElectronico, String celular, String estado) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.estado = estado;
    }

    public Cliente(Integer id, String nombres, String apellidos, String direccion, String correoElectronico, String celular) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.getId() == null) ? 0 : this.getId().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
