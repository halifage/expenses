package com.halif.expenses.mapper

import com.halif.expenses.common.IEntityDtoMapper
import com.halif.expenses.dto.ExpenseTypeDto
import com.halif.expenses.entity.ExpenseTypeEntity

class ExpenseTypeEntityDtoMapper: IEntityDtoMapper<ExpenseTypeEntity, ExpenseTypeDto> {

	override fun toDto(from: ExpenseTypeEntity): ExpenseTypeDto {
		return ExpenseTypeDto(
			id = from.id,
			description = from.description
		)
	}

	override fun toEntity(from: ExpenseTypeDto): ExpenseTypeEntity {
		return ExpenseTypeEntity(
			id = from.id,
			description = from.description
		)
	}

}
