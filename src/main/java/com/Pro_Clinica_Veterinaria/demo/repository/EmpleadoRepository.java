package com.Pro_Clinica_Veterinaria.demo.repository;

import com.Pro_Clinica_Veterinaria.demo.entity.Empleado;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmpleadoRepository extends PagingAndSortingRepository<Empleado, Long> {

}
