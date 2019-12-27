package com.halif.expenses.service

import com.halif.expenses.dto.ExpenseDto
import com.halif.expenses.mapper.ExpenseEntityDtoMapper
import com.halif.expenses.repository.ExpenseRepository
import com.halif.expenses.repository.ExpenseTypeRepository
import com.halif.expenses.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import javax.transaction.Transactional

@Service
class ExpenseService(
	@Autowired val expenseRepository: ExpenseRepository,
	@Autowired val userRepository: UserRepository,
	@Autowired val expenseTypeRepository: ExpenseTypeRepository
) {
	private val expenseEntityDtoMapper = ExpenseEntityDtoMapper()


	fun fetchAllExpenses(): List<ExpenseDto> = expenseEntityDtoMapper.toDtos(expenseRepository.findAll().toList())

	@Transactional
	fun addExpenses(expenses: List<ExpenseDto>): List<Int> = expenseRepository.saveAll(expenseEntityDtoMapper.toEntities(expenses)).map { it.id!! }

}

