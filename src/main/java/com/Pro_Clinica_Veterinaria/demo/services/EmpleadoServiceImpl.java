package com.Pro_Clinica_Veterinaria.demo.services;

import com.Pro_Clinica_Veterinaria.demo.entity.Empleado;
import com.Pro_Clinica_Veterinaria.demo.repository.EmpleadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> findAll() {
        return (List<Empleado>) empleadoRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Empleado empleado) {
        empleadoRepository.save(empleado);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        empleadoRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado findOne(Integer id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Empleado> findAll(Pageable pageable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
