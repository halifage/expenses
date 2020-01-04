package com.halif.expenses.service

import com.halif.expenses.dto.ExpenseByDateRange
import com.halif.expenses.dto.ExpenseDto
import com.halif.expenses.dto.GroupedExpenseDto
import com.halif.expenses.mapper.ExpenseEntityDtoMapper
import com.halif.expenses.repository.ExpenseJdbcRepository
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
	@Autowired val expenseJdbcRepository: ExpenseJdbcRepository
) {
	private val expenseEntityDtoMapper = ExpenseEntityDtoMapper()


	fun fetchAllExpenses(): List<ExpenseDto> = expenseEntityDtoMapper.toDtos(expenseRepository.findAll().toList())

	@Transactional
	fun addExpense(expense: ExpenseDto): Int = expenseRepository.save(expenseEntityDtoMapper.toEntity(expense)).id!!

	@Transactional
	fun updateExpenses(expenses: List<ExpenseDto>): List<Int> {
		return expenseRepository.saveAll(expenseEntityDtoMapper.toEntities(expenses)).map { it.id!! }
	}

	fun fetchExpensesByBudgetId(budgetId: Int): List<ExpenseDto> {
		return expenseEntityDtoMapper.toDtos(expenseRepository.findExpenseEntitiesByBudgetId(budgetId))
	}

	fun fetchExpensesByDateRange(): List<ExpenseByDateRange> {
		val startDate = LocalDateTime.now().withHour(0).withDayOfMonth(1)
		val endDate = startDate.withDayOfMonth(startDate.month.maxLength())
		return expenseJdbcRepository.fetchExpensesByDateRange(startDate, endDate)
	}

}

