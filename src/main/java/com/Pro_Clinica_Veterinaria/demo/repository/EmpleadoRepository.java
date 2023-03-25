package com.Pro_Clinica_Veterinaria.demo.repository;

import com.Pro_Clinica_Veterinaria.demo.entity.Empleado;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpleadoRepository extends PagingAndSortingRepository<Empleado, Integer> {

}
