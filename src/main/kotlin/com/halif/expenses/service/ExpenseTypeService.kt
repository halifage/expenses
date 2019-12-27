package com.halif.expenses.service

import com.halif.expenses.dto.ExpenseTypeDto
import com.halif.expenses.mapper.ExpenseTypeEntityDtoMapper
import com.halif.expenses.repository.ExpenseTypeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ExpenseTypeService(@Autowired val expenseTypeRepository: ExpenseTypeRepository) {
	private val expenseTypeEntityDtoMapper = ExpenseTypeEntityDtoMapper()

	fun fetchAllExpenseTypes(): List<ExpenseTypeDto> {
		return expenseTypeEntityDtoMapper.toDtos(expenseTypeRepository.findAll().toList())
	}


}
