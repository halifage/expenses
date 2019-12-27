package com.halif.expenses.repository

import com.halif.expenses.entity.ExpenseTypeEntity
import org.springframework.data.repository.CrudRepository

interface ExpenseTypeRepository: CrudRepository<ExpenseTypeEntity, Int>
