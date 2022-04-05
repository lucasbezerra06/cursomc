package com.lucasbezerra.cursomc.repositories;

import com.lucasbezerra.cursomc.damain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
