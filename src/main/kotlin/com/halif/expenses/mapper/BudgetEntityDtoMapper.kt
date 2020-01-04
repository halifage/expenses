package com.halif.expenses.mapper

import com.halif.expenses.common.IEntityDtoMapper
import com.halif.expenses.dto.BudgetDto
import com.halif.expenses.entity.BudgetEntity

class BudgetEntityDtoMapper : IEntityDtoMapper<BudgetEntity, BudgetDto> {
	override fun toDto(from: BudgetEntity): BudgetDto {
		return BudgetDto(
			id = from.id,
			amount = from.amount,
			userId = from.userId,
			dateFrom = from.dateFrom,
			dateTo = from.dateTo,
			name = from.name
		)
	}

	override fun toEntity(from: BudgetDto): BudgetEntity {
		return BudgetEntity(
			id = from.id,
			amount = from.amount,
			userId = from.userId,
			dateFrom = from.dateFrom,
			dateTo = from.dateTo,
			name = from.name
		)
	}

}
