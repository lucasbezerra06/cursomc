package com.lucasbezerra.cursomc.repositories;

import com.lucasbezerra.cursomc.damain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}