package com.Pro_Clinica_Veterinaria.demo.entity;

import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = true, unique = false, length = 50)
    private String nombre;

    @Column(name = "idCliente", nullable = true, unique = false)
    private Integer idCliente;

    @ManyToOne
    @JoinColumn(name = "idCliente", referencedColumnName = "id", insertable = false, updatable = false)
    private Cliente cliente;

    @Column(name = "idraza", nullable = true, unique = false)
    private Integer idraza;

    @ManyToOne
    @JoinColumn(name = "idraza", referencedColumnName = "id", insertable = false, updatable = false)
    private Raza razas;

    @Column(name = "idespecie", nullable = true, unique = false)
    private Integer idespecie;

    @ManyToOne
    @JoinColumn(name = "idespecie", referencedColumnName = "id", insertable = false, updatable = false)
    private Especie especies;

    @Column(name = "sexo", nullable = true, unique = false, length = 30)
    private String sexo;

    @Column(name = "color", nullable = true, unique = false, length = 30)
    private String color;

    private String fotoDeLaMascota;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_Nacimiento;

    @Column(name = "estado", nullable = true, unique = false, length = 10)
    @ColumnDefault("'Activo'")
    private String estado;

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public Integer getIdraza() {
        return idraza;
    }

    public Integer getIdespecie() {
        return idespecie;
    }

    public String getSexo() {
        return sexo;
    }

    public String getColor() {
        return color;
    }

    public String getFotoDeLaMascota() {
        return fotoDeLaMascota;
    }

    public Date getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdraza(Integer idraza) {
        this.idraza = idraza;
    }

    public void setIdespecie(Integer idespecie) {
        this.idespecie = idespecie;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFotoDeLaMascota(String fotoDeLaMascota) {
        this.fotoDeLaMascota = fotoDeLaMascota;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Paciente() {
    }
    
    public Paciente(Integer id, String nombre, Integer idCliente, Integer idraza, Integer idespecie, String sexo, String color, String fotoDeLaMascota, Date fecha_Nacimiento, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.idraza = idraza;
        this.idespecie = idespecie;
        this.sexo = sexo;
        this.color = color;
        this.fotoDeLaMascota = fotoDeLaMascota;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.estado = estado;
    }

    public Paciente(Integer id, String nombre, Integer idCliente, Integer idraza, Integer idespecie, String sexo, String color, String fotoDeLaMascota, Date fecha_Nacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.idraza = idraza;
        this.idespecie = idespecie;
        this.sexo = sexo;
        this.color = color;
        this.fotoDeLaMascota = fotoDeLaMascota;
        this.fecha_Nacimiento = fecha_Nacimiento;
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
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;

    }

}
