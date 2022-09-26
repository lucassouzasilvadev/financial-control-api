package com.financialcontrolapi.model

import javax.persistence.*

@Entity
@Table(name = "categoria")
data class Categoria(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val codigo: Long? = null,
    val nome: String? = null
)
