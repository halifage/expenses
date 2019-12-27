package com.halif.expenses.service

import com.halif.expenses.repository.ExpenseRepository
import com.halif.expenses.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService(
	@Autowired val userRepository: UserRepository,
	@Autowired val expenseRepository: ExpenseRepository
) {


}
