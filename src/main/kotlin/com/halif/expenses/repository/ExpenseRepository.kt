package com.halif.expenses.repository

import com.halif.expenses.entity.ExpenseEntity
import org.springframework.data.repository.CrudRepository

interface ExpenseRepository : CrudRepository<ExpenseEntity, Int>
