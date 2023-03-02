package com.Pro_Clinica_Veterinaria.demo.services;

import com.Pro_Clinica_Veterinaria.demo.entity.Empleado;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmpleadoService {

	public List<Empleado> findAll();

	public Page<Empleado> findAll(Pageable pageable);

	public void save(Empleado empleado);

	public Empleado findOne(Long id);

	public void delete(Long id);
}
