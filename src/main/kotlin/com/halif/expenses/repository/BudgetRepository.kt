package com.halif.expenses.repository

import com.halif.expenses.entity.BudgetEntity
import org.springframework.data.repository.CrudRepository

interface BudgetRepository: CrudRepository<BudgetEntity, Int> 
