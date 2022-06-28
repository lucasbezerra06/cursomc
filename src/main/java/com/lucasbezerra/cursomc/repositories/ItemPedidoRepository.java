package com.lucasbezerra.cursomc.repositories;

import com.lucasbezerra.cursomc.domain.ItemPedido;
import com.lucasbezerra.cursomc.domain.ItemPedidoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPK> {
}
