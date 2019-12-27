package com.halif.expenses.controller

import com.halif.expenses.service.ExpenseService
import com.halif.expenses.service.UserService
import com.halif.expenses.util.Routes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
	@Autowired val expenseService: ExpenseService,
	@Autowired val userService: UserService
) {

//	@PostMapping(Routes.)
}
