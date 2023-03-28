package com.Pro_Clinica_Veterinaria.demo.services;

import com.Pro_Clinica_Veterinaria.demo.entity.Especie;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EspecieService {

    public List<Especie> findAll();

    public Page<Especie> findAll(Pageable pageable);

    public void save(Especie especie);

    public Especie findOne(Integer id);

    public void delete(Integer id);
}
