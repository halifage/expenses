package com.halif.expenses.repository

import com.halif.expenses.dto.ExpenseByDateRange
import com.halif.expenses.dto.GroupedExpenseDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Repository
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

@Repository
class ExpenseJdbcRepository(@Autowired @Qualifier("expensesNamedJdbcTemplate") private val expensesJdbcTemplate: NamedParameterJdbcTemplate) {

	fun fetchExpensesByDateRangeGroupedByExpenseType(): List<GroupedExpenseDto> {

		val query = """
			SELECT ExpenseTypes.Description, SUM(Expenses.Amount) AS Total
		FROM Expenses Expenses
		JOIN ExpenseTypes ExpenseTypes ON ExpenseTypes.Id = Expenses.ExpenseTypeId
		GROUP BY ExpenseTypes.Description
		""".trimIndent()

		return expensesJdbcTemplate.query(query) { rs, _ ->
			GroupedExpenseDto(
				expenseCategory = rs.getString("Description"),
				totalValue = rs.getDouble("Total")
			)
		}
	}

	fun fetchExpensesByDateRange(startDate: LocalDateTime, endDate: LocalDateTime): List<ExpenseByDateRange> {
		val query = """
		SELECT
			Expenses.Id,
			ExpenseTypes.Description,
			Expenses.Amount,
			Expenses.ExpenseDate,
			Expenses.BudgetId
		FROM Expenses
		JOIN ExpenseTypes ON ExpenseTypes.Id = Expenses.ExpenseTypeId
		WHERE Expenses.ExpenseDate BETWEEN :startDate AND :endDate
		""".trimIndent()

		val namedParam = MapSqlParameterSource()
		namedParam.addValue("startDate", startDate)
		namedParam.addValue("endDate", endDate)

		return expensesJdbcTemplate.query(query, namedParam) {rs, _->
			ExpenseByDateRange(
				expenseId = rs.getInt("Id"),
				expenseTypeName = rs.getString("Description"),
				amount = rs.getDouble("Amount"),
				date = rs.getTimestamp("ExpenseDate"),
				budgetId = rs.getInt("BudgetId")
			)
		}
	}
}
