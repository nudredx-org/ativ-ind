package com.senai.infoa.trabalho_indv.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infoa.trabalho_indv.Models.Endereco;

@Repository
public interface  EnderecoRepository extends JpaRepository<Endereco, Integer>{
    
}
