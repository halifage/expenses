package com.halif.expenses.util

object Routes {

	//Expense Controller
	const val DELETE_EXPENSE = "/api/expenses/{expenseId}"
	const val UPDATE_EXPENSE = "/api/expenses/{expenseId}"
	const val ADD_EXPENSE = "/api/expenses"
	const val ADD_EXPENSES = "/api/expenses"
	const val FETCH_ALL_EXPENSES = "/api/expenses"
	const val FETCH_EXPENSES_BY_DATE = "/api/expenses/expenses-by-date"
	const val FETCH_EXPENSES_BY_DATE_RANGE = "/api/expenses/expenses-by-date-range"

	//Expense Type Controller
	const val ADD_EXPENSE_TYPE = "/api/expense-types/add"
	const val FETCH_ALL_EXPENSE_TYPES = "/api/expense-types"

	//User Controller
	const val ADD_USER = "/api/users/add"
	const val UPDATE_USER = "/api/users/{userId}"
}
