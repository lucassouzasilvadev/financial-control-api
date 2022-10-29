package com.financialcontrolapi.repository

import com.financialcontrolapi.model.category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface categoryRepository : JpaRepository<category, Long>