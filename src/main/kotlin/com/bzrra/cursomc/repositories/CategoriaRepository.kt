package com.bzrra.cursomc.repositories

import com.bzrra.cursomc.domain.Categoria
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoriaRepository: JpaRepository<Categoria, Int> {
}