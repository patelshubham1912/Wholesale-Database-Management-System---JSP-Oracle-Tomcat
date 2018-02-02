package com.beans;

import java.util.Date;

public class Sales {
	private Date sales_date;
	private int prod_sold;
	private int profit_earned;
	private int Daily_earning;
	private String A_id;
	public Date getSales_date() {
		return sales_date;
	}
	public void setSales_date(Date sales_date) {
		this.sales_date = sales_date;
	}
	public int getProd_sold() {
		return prod_sold;
	}
	public void setProd_sold(int prod_sold) {
		this.prod_sold = prod_sold;
	}
	public int getProfit_earned() {
		return profit_earned;
	}
	public void setProfit_earned(int profit_earned) {
		this.profit_earned = profit_earned;
	}
	public int getDaily_earning() {
		return Daily_earning;
	}
	public void setDaily_earning(int daily_earning) {
		Daily_earning = daily_earning;
	}
	public String getA_id() {
		return A_id;
	}
	public void setA_id(String a_id) {
		A_id = a_id;
	}
	
}
