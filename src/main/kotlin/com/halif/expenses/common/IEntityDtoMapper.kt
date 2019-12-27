package com.halif.expenses.common

import javax.swing.text.html.parser.Entity
import kotlin.streams.toList

interface IEntityDtoMapper<ENTITY: BaseEntity, DTO: BaseDto> {
	fun toDto(from: ENTITY): DTO

	fun toEntity(from: DTO): ENTITY

	fun toDtos(froms: Collection<ENTITY>): List<DTO> {
		return froms.stream().map { from -> toDto(from) }.toList()
	}

	fun toEntities(froms: Collection<DTO>): List<ENTITY> {
		return froms.stream().map { from -> toEntity(from) }.toList()
	}
}
