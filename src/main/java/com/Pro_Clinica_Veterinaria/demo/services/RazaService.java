
package com.Pro_Clinica_Veterinaria.demo.services;

import com.Pro_Clinica_Veterinaria.demo.entity.Raza;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface RazaService {
     public List<Raza> findAll();

    public Page<Raza> findAll(Pageable pageable);

    public void save(Raza raza);

    public Raza findOne(Integer id);

    public void delete(Integer id);
}
