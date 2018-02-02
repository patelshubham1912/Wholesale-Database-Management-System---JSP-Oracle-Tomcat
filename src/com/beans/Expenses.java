package com.beans;

import java.util.Date;

public class Expenses {
	private String Expense_id;
	private String Expense_type;
	private int Daily_expense;
	private Date Expense_date;
	private String A_id;
	public String getExpense_id() {
		return Expense_id;
	}
	public void setExpense_id(String expense_id) {
		Expense_id = expense_id;
	}
	public String getExpense_type() {
		return Expense_type;
	}
	public void setExpense_type(String expense_type) {
		Expense_type = expense_type;
	}
	public int getDaily_expense() {
		return Daily_expense;
	}
	public void setDaily_expense(int daily_expense) {
		Daily_expense = daily_expense;
	}
	public Date getExpense_date() {
		return Expense_date;
	}
	public void setExpense_date(Date expense_date) {
		Expense_date = expense_date;
	}
	public String getA_id() {
		return A_id;
	}
	public void setA_id(String a_id) {
		A_id = a_id;
	}
	
}
