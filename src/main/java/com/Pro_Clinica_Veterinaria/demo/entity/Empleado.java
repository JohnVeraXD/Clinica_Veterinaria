package com.Pro_Clinica_Veterinaria.demo.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;

// hola roba roba

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombres", nullable = true, unique = false, length = 50)
    private String nombres;

    @Column(name = "apellidos", nullable = true, unique = false, length = 50)
    private String apellidos;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_Nacimiento;

    @Column(name = "cedula", nullable = false, unique = true, length = 13)
    private String cedula;

    @Column(name = "celular", nullable = true, unique = false, length = 10)
    private String celular;

    @Column(name = "direccion", nullable = true, unique = false, length = 50)
    private String direccion;

    @Column(name = "tipo", nullable = false, unique = false, length = 30)
    private String tipo;

    private String foto;

    @Column(name = "estado", nullable = true, unique = false, length = 10)
    @ColumnDefault("'Activo'")
    private String estado;
    
    
    @Column(name = "hola", nullable = true, unique = false, length = 10)
    private String hola;
    
     @Column(name = "activo", nullable = true, unique = false, length = 10)
    private String activo;

    @OneToMany(mappedBy = "empleado")
    private List<Usuario> Usuarios;

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

    public String getFoto() {
        return foto;
    }

    public String getEstado() {
        return estado;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Empleado() {

    }

    public Empleado(Integer id, String nombres, String apellidos, Date fecha_Nacimiento, String cedula, String celular, String direccion, String tipo, String foto, String estado) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.cedula = cedula;
        this.celular = celular;
        this.direccion = direccion;
        this.tipo = tipo;
        this.foto = foto;
        this.estado = estado;
    }

    public Empleado(Integer id, String nombres, String apellidos, Date fecha_Nacimiento, String cedula, String celular, String direccion, String tipo, String estado) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.cedula = cedula;
        this.celular = celular;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombres + ", apellidos=" + apellidos + ", fecha_Nacimiento=" + fecha_Nacimiento
                + ", cedula=" + cedula + ",celular=" + celular + ",direccion" + direccion + ",tipo" + tipo + ",foto" + foto + ",estado" + estado + "]";
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
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
