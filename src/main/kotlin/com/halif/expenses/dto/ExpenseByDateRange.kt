package com.halif.expenses.dto

import java.sql.Timestamp
import java.time.LocalDate

data class ExpenseByDateRange (
	val expenseId: Int,
	val expenseTypeName: String,
	val amount: Double,
	val date: Timestamp,
	val budgetId: Int?
)
