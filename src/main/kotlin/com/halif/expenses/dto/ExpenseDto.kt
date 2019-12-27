package com.halif.expenses.dto

import com.halif.expenses.common.BaseDto
import com.halif.expenses.entity.ExpenseTypeEntity
import com.halif.expenses.entity.UserEntity
import java.time.LocalDateTime

data class ExpenseDto (
	val id: Int,
	val amount: Double,
	val date: LocalDateTime?,
	val userId: Int?,
	val expenseTypeId: Int,
	val description: String?
): BaseDto
