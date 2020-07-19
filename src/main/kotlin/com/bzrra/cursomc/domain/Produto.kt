package com.bzrra.cursomc.domain

import java.io.Serializable
import javax.persistence.*

@Entity
class Produto() : Serializable {
    companion object {
        private const val serialVersionUID = 1L
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    final var nome: String = ""
    final var preco: Double = 0.00

    @ManyToMany
    @JoinTable(name = "PRODUTO_CATEGORIA",
            joinColumns = [JoinColumn(name = "produto_id")],
            inverseJoinColumns = [JoinColumn(name = "categoria_id")]
    )
    val categorias: MutableList<Categoria> = mutableListOf()


    constructor(id: Int?, nome: String, preco: Double) : this() {
        this.id = id
        this.nome = nome
        this.preco = preco
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Produto

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id ?: 0
    }
}