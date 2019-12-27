package com.halif.expenses.entity

import com.halif.expenses.common.BaseEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToMany
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "Expenses")
data class ExpenseEntity (

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Int,

	val amount: Double,

	@JoinColumn(name = "UserId", referencedColumnName = "Id")
	val userId: Int? = null,

	@JoinColumn(name = "ExpenseTypeId", referencedColumnName = "Id")
	val expenseTypeId: Int,

	@Column(name = "ExpenseDate")
	val date: LocalDateTime? = null,

	val description: String? = null
): BaseEntity
