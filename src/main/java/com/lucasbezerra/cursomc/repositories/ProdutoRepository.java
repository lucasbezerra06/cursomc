package com.lucasbezerra.cursomc.repositories;

import com.lucasbezerra.cursomc.damain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
