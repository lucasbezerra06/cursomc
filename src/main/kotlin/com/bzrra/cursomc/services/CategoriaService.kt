package com.bzrra.cursomc.services

import com.bzrra.cursomc.domain.Categoria
import com.bzrra.cursomc.repositories.CategoriaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Example
import org.springframework.stereotype.Service
import java.util.*

@Service
class CategoriaService {

    @Autowired
    private lateinit var repo: CategoriaRepository

    fun buscar(id: Int): Categoria? {
        val obj: Optional<Categoria> = repo.findById(id)

        return obj.orElse(null)
    }
}