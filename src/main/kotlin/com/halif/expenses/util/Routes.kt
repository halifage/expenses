package com.halif.expenses.util

object Routes {

	//Budget Controller
	const val FETCH_ALL_BUDGETS = "/api/budgets"
	const val ADD_BUDGET = "/api/budgets"

	//Expense Controller
	const val DELETE_EXPENSE = "/api/expenses/{expenseId}"
	const val UPDATE_EXPENSES = "/api/expenses/update-expenses"
	const val ADD_EXPENSE = "/api/expenses"
	const val FETCH_ALL_EXPENSES = "/api/expenses"
	const val EXPENSES_BY_BUDGET_ID = "/api/expenses/expenses-by-budget-id/{budgetId}"
	const val EXPENSES_GROUPED_BY_EXPENSE_TYPE = "/api/expenses/expenses-grouped-by-expense-type"
	const val FETCH_EXPENSES_BY_DATE = "/api/expenses/expenses-by-date"
	const val FETCH_EXPENSES_BY_DATE_RANGE = "/api/expenses/expenses-by-date-range"

	//Expense Type Controller
	const val ADD_EXPENSE_TYPE = "/api/expense-types/add"
	const val FETCH_ALL_EXPENSE_TYPES = "/api/expense-types"

	//User Controller
	const val ADD_USER = "/api/users/add"
	const val UPDATE_USER = "/api/users/{userId}"
}
