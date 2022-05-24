package com.lucasbezerra.cursomc.repositories;

import com.lucasbezerra.cursomc.damain.ItemPedido;
import com.lucasbezerra.cursomc.damain.ItemPedidoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPK> {
}
