package com.lucasbezerra.cursomc.repositories;

import com.lucasbezerra.cursomc.damain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}