package com.lucasbezerra.cursomc.repositories;

import com.lucasbezerra.cursomc.damain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
