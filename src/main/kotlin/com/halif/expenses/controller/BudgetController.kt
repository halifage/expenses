package com.halif.expenses.controller

import com.halif.expenses.dto.BudgetDto
import com.halif.expenses.service.BudgetService
import com.halif.expenses.util.Routes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BudgetController (
	@Autowired val budgetService: BudgetService
){

	@PostMapping(Routes.ADD_BUDGET)
	fun addBudget(@RequestBody(required = true) newBudget: BudgetDto): Int = budgetService.addBudget(newBudget)


	@GetMapping(Routes.FETCH_ALL_BUDGETS)
	fun fetchAllBudgets(): List<BudgetDto> = budgetService.fetchAllBudgets()
}
