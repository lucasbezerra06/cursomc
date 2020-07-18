package com.bzrra.cursomc.controller

import com.bzrra.cursomc.domain.Categoria
import com.bzrra.cursomc.services.CategoriaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/categorias"])
class CategoriaController {

    @Autowired
    private lateinit var service: CategoriaService

    @GetMapping(value = ["/{id}"])
    fun find(@PathVariable id: Int): ResponseEntity<Any> {
        return ResponseEntity.ok().body(service.buscar(id))
    }
}