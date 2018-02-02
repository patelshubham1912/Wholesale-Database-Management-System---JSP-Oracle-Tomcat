package com.beans;

import java.util.Date;

public class Orders {
	private String Order_id;
	private int Amount;
	private int Discount_applied;
	private String C_id;
	private String Staff_id;
	private String order_date;
	private String Bill_id;
	public String getOrder_id() {
		return Order_id;
	}
	public void setOrder_id(String order_id) {
		Order_id = order_id;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public int getDiscount_applied() {
		return Discount_applied;
	}
	public void setDiscount_applied(int discount_applied) {
		Discount_applied = discount_applied;
	}
	public String getC_id() {
		return C_id;
	}
	public void setC_id(String c_id) {
		C_id = c_id;
	}
	public String getStaff_id() {
		return Staff_id;
	}
	public void setStaff_id(String staff_id) {
		Staff_id = staff_id;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public String getBill_id() {
		return Bill_id;
	}
	public void setBill_id(String bill_id) {
		Bill_id = bill_id;
	}
	
}
