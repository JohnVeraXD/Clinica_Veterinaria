package com.Pro_Clinica_Veterinaria.demo.services;

import com.Pro_Clinica_Veterinaria.demo.entity.Especie;
import com.Pro_Clinica_Veterinaria.demo.repository.EspecieRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EspecieServiceImpl implements EspecieService {

    @Autowired
    private EspecieRepository especieRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Especie> findAll() {
        return (List<Especie>) especieRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Especie especie) {
        especieRepository.save(especie);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        especieRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Especie findOne(Integer id) {
        return especieRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Especie> findAll(Pageable pageable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
