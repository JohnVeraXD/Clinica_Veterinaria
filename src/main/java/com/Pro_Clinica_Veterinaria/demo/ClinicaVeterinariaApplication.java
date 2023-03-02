package com.Pro_Clinica_Veterinaria.demo;

import com.Pro_Clinica_Veterinaria.demo.repo.EmpleadoRepo;
import com.Pro_Clinica_Veterinaria.demo.entity.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ClinicaVeterinariaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ClinicaVeterinariaApplication.class, args);
    }


    private EmpleadoRepo empleadorepo;

    @Override
    public void run(String... args) throws Exception {
/*
        Empleado empleado1 = new Empleado("John", "Vera", "2022-03-01", "0928064524", "0965423564", "ViaGuayas", "Veterinario", 1);
        empleadorepo.save(empleado1);

        Empleado empleado2 = new Empleado("Juan", "Macias", "2022-03-01", "0928064524", "0965423564", "ViaQuevedo", "Veterinario", 1);
        empleadorepo.save(empleado2);

        Empleado empleado3 = new Empleado("Jose", "Jaime", "2022-03-01", "0928064524", "0965423564", "ViaGuayaquil", "Veterinario", 1);
        empleadorepo.save(empleado3); 
*/
    } 

}
