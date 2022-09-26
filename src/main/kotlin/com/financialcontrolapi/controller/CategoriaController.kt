package com.financialcontrolapi.controller

import com.financialcontrolapi.model.Categoria
import com.financialcontrolapi.repository.CategoriaRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1/categorias")
class CategoriaController (private val repository: CategoriaRepository){

    @GetMapping
    fun listar(): List<Categoria> {
        return repository.findAll()
    }

}