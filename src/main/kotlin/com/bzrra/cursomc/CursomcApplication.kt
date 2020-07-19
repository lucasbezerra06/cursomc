package com.bzrra.cursomc

import com.bzrra.cursomc.domain.Categoria
import com.bzrra.cursomc.repositories.CategoriaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CursomcApplication : CommandLineRunner {

    @Autowired
    private lateinit var categoriaRepository: CategoriaRepository

    override fun run(vararg args: String?) {
        val cat1 = Categoria(0, "Informática")
        val cat2 = Categoria(0, "Escritório")

        categoriaRepository.saveAll(listOf(cat1, cat2))
    }

}

fun main(args: Array<String>) {
    runApplication<CursomcApplication>(*args)
}
