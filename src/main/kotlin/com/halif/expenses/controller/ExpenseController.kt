package com.halif.expenses.controller

import com.halif.expenses.service.ExpenseService
import com.halif.expenses.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController

@RestController
class ExpenseController(
	@Autowired val expenseService: ExpenseService,
	@Autowired val userService: UserService
) {

}