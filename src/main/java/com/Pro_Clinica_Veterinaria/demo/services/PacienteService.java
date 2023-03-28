package com.Pro_Clinica_Veterinaria.demo.services;

import com.Pro_Clinica_Veterinaria.demo.entity.Paciente;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PacienteService {

    public List<Paciente> findAll();

    public Page<Paciente> findAll(Pageable pageable);

    public void save(Paciente paciente);

    public Paciente findOne(Integer id);

    public void delete(Integer id);
}
