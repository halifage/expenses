package com.halif.expenses.entity

import com.halif.expenses.common.BaseEntity
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "ExpenseTypes")
data class ExpenseTypeEntity(

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Int? = null,

	val description: String
): BaseEntity

