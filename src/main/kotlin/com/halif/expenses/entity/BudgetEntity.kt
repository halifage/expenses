package com.halif.expenses.entity

import com.halif.expenses.common.BaseEntity
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.Table

@Entity
@Table(name = "Budgets")
data class BudgetEntity (
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Int? = null,

	val amount: Double,

	@JoinColumn(name = "UserId", referencedColumnName = "Id")
	val userId: Int? = null,

	@Column(name = "DateFrom")
	val dateFrom: LocalDate? = null,

	@Column(name = "DateTo")
	val dateTo: LocalDate? = null,

	val name: String? = null
) : BaseEntity
