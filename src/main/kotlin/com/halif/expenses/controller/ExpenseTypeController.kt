package com.halif.expenses.controller

import com.halif.expenses.dto.ExpenseTypeDto
import com.halif.expenses.repository.ExpenseTypeRepository
import com.halif.expenses.service.ExpenseService
import com.halif.expenses.service.ExpenseTypeService
import com.halif.expenses.service.UserService
import com.halif.expenses.util.Routes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExpenseTypeController(
	@Autowired val expenseService: ExpenseService,
	@Autowired val userService: UserService,
	@Autowired val expenseTypeService: ExpenseTypeService,
	@Autowired val expenseTypeRepository: ExpenseTypeRepository
) {

	@GetMapping(Routes.FETCH_ALL_EXPENSE_TYPES)
	fun fetchAllExpenseTypes(): List<ExpenseTypeDto> = expenseTypeService.fetchAllExpenseTypes()
}
