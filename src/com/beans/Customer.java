package com.beans;

public class Customer {
	private String C_id;
	private String C_name;
	private String C_add;
	private int C_SSN;
	private int Discount_offered;
	private String User_id;
	public String getC_id() {
		return C_id;
	}
	public void setC_id(String c_id) {
		C_id = c_id;
	}
	public String getC_name() {
		return C_name;
	}
	public void setC_name(String c_name) {
		C_name = c_name;
	}
	public String getC_add() {
		return C_add;
	}
	public void setC_add(String c_add) {
		C_add = c_add;
	}
	public int getC_SSN() {
		return C_SSN;
	}
	public void setC_SSN(int c_SSN) {
		C_SSN = c_SSN;
	}
	public int getDiscount_offered() {
		return Discount_offered;
	}
	public void setDiscount_offered(int discount_offered) {
		Discount_offered = discount_offered;
	}
	public String getUser_id() {
		return User_id;
	}
	public void setUser_id(String user_id) {
		User_id = user_id;
	}
	
}
