package com.halif.expenses.entity

import com.halif.expenses.common.BaseEntity
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "Users")
data class UserEntity (

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Int? = null,

	val firstName: String,

	val lastName: String? = null,

	val email: String? = null
): BaseEntity
