package com.financialcontrolapi.model

import javax.persistence.*

@Entity
@Table(name = "category")
data class category(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val code: Long? = null,
    val name: String? = null
)
