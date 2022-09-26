package com.financialcontrolapi.repository

import com.financialcontrolapi.model.Categoria
import org.springframework.data.jpa.repository.JpaRepository

interface CategoriaRepository : JpaRepository<Categoria, Long>