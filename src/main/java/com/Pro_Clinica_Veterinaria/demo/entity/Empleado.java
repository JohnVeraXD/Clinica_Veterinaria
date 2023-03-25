package com.Pro_Clinica_Veterinaria.demo.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "empleados")
public class Empleado {

      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
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
    //private Image foto;

    public Empleado() {

    }

    public Empleado(Integer id,String nombres, String apellidos, Date fecha_Nacimiento, String cedula, String celular, String direccion, String tipo) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.cedula = cedula;
        this.celular = celular;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    
    @Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombres + ", apellidos=" + apellidos + ", fecha_Nacimiento=" + fecha_Nacimiento
				+ ", cedula=" + cedula + ",celular="+ celular + ",direccion"+direccion+ ",tipo" +tipo+ "]";
	}

}
