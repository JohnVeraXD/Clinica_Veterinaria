package com.Pro_Clinica_Veterinaria.demo.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Razas")
public class Raza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombreRaza", nullable = true, unique = false, length = 40)
    private String nombreRaza;

    @Column(name = "descripcion", nullable = true, unique = false, length = 100)
    private String descripcion;

    @Column(name = "idEspecie", nullable = true, unique = false)
    private Integer idEspecie;

    @ManyToOne
    @JoinColumn(name = "idEspecie", referencedColumnName = "id", insertable = false, updatable = false)
    private Especie Especies;

    @OneToMany(mappedBy = "razas")
    private List<Paciente> pacientes;

    public Integer getId() {
        return id;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getIdEspecie() {
        return idEspecie;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIdEspecie(Integer idEspecie) {
        this.idEspecie = idEspecie;
    }

    public Raza() {
    }

    public Raza(Integer id, String nombreRaza, String descripcion, Integer idEspecie, List<Paciente> pacientes) {
        this.id = id;
        this.nombreRaza = nombreRaza;
        this.descripcion = descripcion;
        this.idEspecie = idEspecie;
        this.pacientes = pacientes;
    }

    public Raza(Integer id, String nombreRaza, String descripcion, Integer idEspecie) {
        this.id = id;
        this.nombreRaza = nombreRaza;
        this.descripcion = descripcion;
        this.idEspecie = idEspecie;
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
        if (!(object instanceof Raza)) {
            return false;
        }
        Raza other = (Raza) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
}
