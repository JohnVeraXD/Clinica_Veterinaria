package com.Pro_Clinica_Veterinaria.demo.services;

import com.Pro_Clinica_Veterinaria.demo.entity.Cliente;
import com.Pro_Clinica_Veterinaria.demo.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceIpml implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public Page<Cliente> findAll(Pageable pageable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findOne(Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        clienteRepository.deleteById(id);
    }

}
