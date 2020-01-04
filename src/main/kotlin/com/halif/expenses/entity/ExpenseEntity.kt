package com.halif.expenses.entity

import com.halif.expenses.common.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.Table

@Entity
@Table(name = "Expenses")
data class ExpenseEntity(

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Int? = null,

	val amount: Double,

	@JoinColumn(name = "ExpenseTypeId", referencedColumnName = "Id")
	val expenseTypeId: Int,

	@JoinColumn(name = "BudgetId", referencedColumnName = "Id")
	val budgetId: Int?,

	@Column(name = "ExpenseDate")
	val date: LocalDateTime? = null,

	val description: String? = null
) : BaseEntity
