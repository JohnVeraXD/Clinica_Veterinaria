package com.Pro_Clinica_Veterinaria.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Pro_Clinica_Veterinaria.demo.entity.Empleado;
import com.Pro_Clinica_Veterinaria.demo.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> findAll() {
        return (List<Empleado>) empleadoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Empleado> findAll(Pageable pageable) {
        return empleadoRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public void save(Empleado empleado) {
        empleadoRepository.save(empleado);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        empleadoRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado findOne(Long id) {
        return empleadoRepository.findById(id).orElse(null);
    }
}
