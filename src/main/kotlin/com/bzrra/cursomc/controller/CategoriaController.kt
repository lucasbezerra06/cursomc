package com.bzrra.cursomc.controller

import com.bzrra.cursomc.domain.Categoria
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value= ["/categorias"])
class CategoriaController {

    @GetMapping
    fun listar(): List<Categoria>{
        val cat1 = Categoria(1, "Informática")
        val cat2 = Categoria(2, "Escritório")

        return listOf(cat1, cat2)
    }
}