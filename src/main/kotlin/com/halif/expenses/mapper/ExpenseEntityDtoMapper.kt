package com.halif.expenses.mapper

import com.halif.expenses.common.IEntityDtoMapper
import com.halif.expenses.dto.ExpenseDto
import com.halif.expenses.entity.ExpenseEntity

class ExpenseEntityDtoMapper : IEntityDtoMapper<ExpenseEntity, ExpenseDto> {

	override fun toDto(from: ExpenseEntity): ExpenseDto {
		return ExpenseDto(
			id = from.id,
			amount = from.amount,
			date = from.date,
			description = from.description,
			expenseTypeId = from.expenseTypeId,
			budgetId = from.budgetId
		)
	}

	override fun toEntity(from: ExpenseDto): ExpenseEntity {
		return ExpenseEntity(
			id = from.id,
			amount = from.amount,
			date = from.date,
			description = from.description,
			expenseTypeId = from.expenseTypeId,
			budgetId = from.budgetId
		)
	}

}
