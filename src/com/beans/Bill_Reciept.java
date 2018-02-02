package com.beans;

import java.util.Date;

public class Bill_Reciept {
	private String Bill_id;
	private int Bill_Amount;
	private Date order_date;
	public String getBill_id() {
		return Bill_id;
	}
	public void setBill_id(String bill_id) {
		Bill_id = bill_id;
	}
	public int getBill_Amount() {
		return Bill_Amount;
	}
	public void setBill_Amount(int bill_Amount) {
		Bill_Amount = bill_Amount;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	
}
