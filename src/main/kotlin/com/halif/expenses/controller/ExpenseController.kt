package com.halif.expenses.controller

import com.halif.expenses.dto.ExpenseByDateRange
import com.halif.expenses.dto.ExpenseDto
import com.halif.expenses.dto.GroupedExpenseDto
import com.halif.expenses.repository.ExpenseJdbcRepository
import com.halif.expenses.service.ExpenseService
import com.halif.expenses.util.Routes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ExpenseController(
	@Autowired val expenseService: ExpenseService,
	@Autowired val expenseJdbcRepository: ExpenseJdbcRepository
) {

	@GetMapping(Routes.FETCH_ALL_EXPENSES)
	fun fetchAllExpenses(): List<ExpenseDto> = expenseService.fetchAllExpenses()

	@GetMapping(Routes.FETCH_EXPENSES_BY_DATE_RANGE)
	fun fetchExpensesByDateRange(): List<ExpenseByDateRange> = expenseService.fetchExpensesByDateRange()

	@GetMapping(Routes.EXPENSES_GROUPED_BY_EXPENSE_TYPE)
	fun fetchExpensesByDateRangeGroupedByExpenseType(): List<GroupedExpenseDto> = expenseJdbcRepository.fetchExpensesByDateRangeGroupedByExpenseType()

	@PostMapping(Routes.ADD_EXPENSE)
	fun addExpense(@RequestBody(required = true) expense: ExpenseDto): Int = expenseService.addExpense(expense)
	
	@PutMapping(Routes.UPDATE_EXPENSES)
	fun updateExpenses(@RequestBody(required = true) expenses: List<ExpenseDto>): List<Int> = expenseService.updateExpenses(expenses)
	
	@GetMapping(Routes.EXPENSES_BY_BUDGET_ID)
	fun fetchExpensesByBudgetId(@PathVariable(required = true) budgetId: Int): List<ExpenseDto> = expenseService.fetchExpensesByBudgetId(budgetId)
}
