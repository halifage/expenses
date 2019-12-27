package com.halif.expenses.dto

import com.halif.expenses.common.BaseDto

data class ExpenseTypeDto (
	val id: Int,
	val description: String
): BaseDto
