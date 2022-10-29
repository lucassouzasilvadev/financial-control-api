package com.financialcontrolapi.controller

import com.financialcontrolapi.model.category
import com.financialcontrolapi.repository.categoryRepository
import jdk.jfr.Category
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder

@RestController
@RequestMapping("/v1/categories")
class CategoriaController (private val repository: categoryRepository){

    @GetMapping
    fun getAllCategories(): List<category> {
        return repository.findAll()
    }

    @PostMapping
    fun createCategory(@RequestBody category: category, uriBuilder: UriComponentsBuilder): ResponseEntity<category>{
        var categoryCreated = repository.save(category)
        val uri = uriBuilder.path("/v1/categories/${categoryCreated.code}").build().toUri()
        return ResponseEntity.created(uri).body(categoryCreated)
    }

    @GetMapping("/{code}")
    fun getCategoriesById(@PathVariable code: Long) : ResponseEntity<category>{
        val categorySearch = repository.findById(code)
        if (categorySearch.isEmpty){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build()
        }
        return ResponseEntity.ok(categorySearch.get())
    }
    

}