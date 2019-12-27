package com.halif.expenses.repository
import com.halif.expenses.entity.UserEntity
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<UserEntity, Int>
