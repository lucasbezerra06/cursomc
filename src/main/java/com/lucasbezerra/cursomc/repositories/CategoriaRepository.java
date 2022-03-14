package com.lucasbezerra.cursomc.repositories;

import com.lucasbezerra.cursomc.damain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
