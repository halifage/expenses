package com.halif.expenses.dto

import com.halif.expenses.common.BaseDto
import com.halif.expenses.entity.ExpenseTypeEntity
import com.halif.expenses.entity.UserEntity
import java.time.LocalDateTime

data class ExpenseDto (
	val id: Int? = null,
	val amount: Double,
	val date: LocalDateTime?,
	val userId: Int? = null,
	val expenseTypeId: Int,
	val description: String? = null
): BaseDto
