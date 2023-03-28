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

@Entity
@Table(name = "Especies")
public class Especie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NombreEspecie", nullable = true, unique = false, length = 50)
    private String nombreEspecie;

    @Column(name = "descripcion", nullable = true, unique = false, length = 100)
    private String descripcion;

    @OneToMany(mappedBy = "especies")
    private List<Paciente> pacientes;

    @OneToMany(mappedBy = "Especies")
    private List<Raza> razas;

    public Integer getId() {
        return id;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Especie() {
    }

    public Especie(Integer id, String nombreEspecie, String descripcion) {
        this.id = id;
        this.nombreEspecie = nombreEspecie;
        this.descripcion = descripcion;
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
        if (!(object instanceof Especie)) {
            return false;
        }
        Especie other = (Especie) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
