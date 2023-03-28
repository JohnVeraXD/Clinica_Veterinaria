
package com.Pro_Clinica_Veterinaria.demo.repository;

import com.Pro_Clinica_Veterinaria.demo.entity.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Integer>{
    
}
