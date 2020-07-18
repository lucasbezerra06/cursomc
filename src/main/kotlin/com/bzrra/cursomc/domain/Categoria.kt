package com.bzrra.cursomc.domain

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Categoria : Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    final var id: Int = 0
    final var nome: String = ""

    constructor()

    constructor(id: Int, nome: String){
        this.id = id
        this.nome = nome
    }

    companion object {
        private const val serialVersionUID = 1L
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Categoria

        if (id != other.id) return false
        if (nome != other.nome) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + nome.hashCode()
        return result
    }
}