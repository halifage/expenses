package com.halif.expenses.controller

import com.halif.expenses.dto.ExpenseDto
import com.halif.expenses.service.ExpenseService
import com.halif.expenses.service.UserService
import com.halif.expenses.util.Routes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ExpenseController(
	@Autowired val expenseService: ExpenseService,
	@Autowired val userService: UserService
) {

	@GetMapping(Routes.FETCH_ALL_EXPENSES)
	fun fetchAllExpenses(): List<ExpenseDto> = expenseService.fetchAllExpenses()

	@PostMapping(Routes.ADD_EXPENSES)
	fun addExpenses(@RequestBody(required = true) expenses: List<ExpenseDto>): List<Int> = expenseService.addExpenses(expenses)
}
