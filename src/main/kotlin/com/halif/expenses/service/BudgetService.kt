package com.halif.expenses.service

import com.halif.expenses.dto.BudgetDto
import com.halif.expenses.mapper.BudgetEntityDtoMapper
import com.halif.expenses.repository.BudgetRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody

@Service
class BudgetService (@Autowired val budgetRepository: BudgetRepository){

	private val budgetEntityDtoMapper = BudgetEntityDtoMapper()

	fun addBudget(@RequestBody newBudget: BudgetDto): Int {
		return budgetRepository.save(budgetEntityDtoMapper.toEntity(newBudget)).id!!
	}

	fun fetchAllBudgets(): List<BudgetDto> {
		return budgetEntityDtoMapper.toDtos(budgetRepository.findAll().toList())
	}
}
