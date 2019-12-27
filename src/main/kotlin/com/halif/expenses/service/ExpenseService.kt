package com.halif.expenses.service

import com.halif.expenses.repository.ExpenseRepository
import com.halif.expenses.repository.ExpenseTypeRepository
import com.halif.expenses.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ExpenseService(
	@Autowired val expenseRepository: ExpenseRepository,
	@Autowired val userRepository: UserRepository,
	@Autowired val expenseTypeRepository: ExpenseTypeRepository
) {

}

