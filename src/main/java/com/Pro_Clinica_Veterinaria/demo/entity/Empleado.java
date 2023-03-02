
package com.Pro_Clinica_Veterinaria.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author ANNOUS SUONNA
 */
@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_Nacimiento;
    
    @Column(unique = true, length = 13)
    private String cedula;
    private String celular;
    private String direccion;
    private String tipo;
    private int estado;
    //private Image foto;

    public Empleado() {

    }

    public Empleado(String nombres, String apellidos, Date fecha_Nacimiento, String cedula, String celular, String direccion, String tipo, int estado) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.cedula = cedula;
        this.celular = celular;
        this.direccion = direccion;
        this.tipo = tipo;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
