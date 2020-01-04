package com.halif.expenses

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import javax.sql.DataSource

@Configuration
class DBConfiguration {

	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")
	fun dataSource(): DataSource {
		return DataSourceBuilder.create().build()
	}

	@Bean(name = ["expensesNamedJdbcTemplate"])
	fun expensesNamedJdbcTemplate(dataSource: DataSource): NamedParameterJdbcTemplate =
		NamedParameterJdbcTemplate(dataSource)
}
