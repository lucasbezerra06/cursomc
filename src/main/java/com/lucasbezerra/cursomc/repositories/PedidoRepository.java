package com.lucasbezerra.cursomc.repositories;

import com.lucasbezerra.cursomc.damain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
