package com.Pro_Clinica_Veterinaria.demo.services;

import com.Pro_Clinica_Veterinaria.demo.entity.Cliente;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClienteService {

    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public void save(Cliente cliente);

    public Cliente findOne(Integer id);

    public void delete(Integer id);
}
