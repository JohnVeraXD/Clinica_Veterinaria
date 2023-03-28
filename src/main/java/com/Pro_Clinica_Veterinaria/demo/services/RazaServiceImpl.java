
package com.Pro_Clinica_Veterinaria.demo.services;

import com.Pro_Clinica_Veterinaria.demo.entity.Raza;
import com.Pro_Clinica_Veterinaria.demo.repository.RazaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class RazaServiceImpl implements RazaService {

   @Autowired
    private RazaRepository razaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Raza> findAll() {
        return (List<Raza>) razaRepository.findAll();
    }

    @Transactional
    public void save(Raza raza) {
        razaRepository.save(raza);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        razaRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Raza findOne(Integer id) {
        return razaRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Raza> findAll(Pageable pageable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object findAll(Object pageable) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void save(Object especie) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
