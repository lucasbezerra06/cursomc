package com.bzrra.cursomc

import com.bzrra.cursomc.domain.Categoria
import com.bzrra.cursomc.domain.Produto
import com.bzrra.cursomc.repositories.CategoriaRepository
import com.bzrra.cursomc.repositories.ProdutoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CursomcApplication : CommandLineRunner {

    @Autowired
    private lateinit var categoriaRepository: CategoriaRepository

    @Autowired
    private lateinit var produtoRepository: ProdutoRepository

    override fun run(vararg args: String?) {

        val cat1 = Categoria(null, "Informática")
        val cat2 = Categoria(null, "Escritório")

        val p1 = Produto(null, "Computador", 2000.00)
        val p2 = Produto(null, "Impressora", 800.00)
        val p3 = Produto(null, "Mouse", 80.00)

        cat1.produtos.addAll(listOf(p1, p2, p3))
        cat2.produtos.addAll(listOf(p2))

        p1.categorias.addAll(listOf(cat1))
        p2.categorias.addAll(listOf(cat1, cat2))
        p3.categorias.addAll(listOf(cat1))

        categoriaRepository.saveAll(listOf(cat1, cat2))
        produtoRepository.saveAll(listOf(p1, p2, p3))
    }

}

fun main(args: Array<String>) {
    runApplication<CursomcApplication>(*args)
}
