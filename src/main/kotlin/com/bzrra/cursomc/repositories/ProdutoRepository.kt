package com.bzrra.cursomc.repositories

import com.bzrra.cursomc.domain.Produto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProdutoRepository : JpaRepository<Produto, Int> {
}