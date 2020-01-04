package com.halif.expenses

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


@SpringBootApplication
@EnableJpaRepositories(basePackages = ["com.halif"])
@EntityScan(basePackages = ["com.halif"])
@ComponentScan(value = ["com.halif"])
class ExpensesApplication

fun main(args: Array<String>) {
	runApplication<ExpensesApplication>(*args)
}
