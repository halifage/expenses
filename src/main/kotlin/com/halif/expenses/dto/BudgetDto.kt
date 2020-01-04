package com.halif.expenses.dto

import com.halif.expenses.common.BaseDto
import java.time.LocalDate

data class BudgetDto (
	val id: Int?,
	val amount: Double,
	val dateFrom: LocalDate?,
	val dateTo: LocalDate?,
	val userId: Int?,
	val name: String?
): BaseDto
