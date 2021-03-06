package com.bzrra.cursomc.domain

import java.io.Serializable
import javax.persistence.*

@Entity
class Categoria() : Serializable {
    companion object {
        private const val serialVersionUID = 1L
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    final var nome: String = ""

    @ManyToMany(mappedBy = "categorias")
    val produtos: MutableList<Produto> = mutableListOf()

    constructor(id: Int?, nome: String) : this() {
        this.id = id
        this.nome = nome
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Categoria

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id ?: 0
    }


}