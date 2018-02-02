package com.beans;

import java.util.Date;

public class Online_Orders {
	private String Tracking_id;
	private int Trans_id;
	private String C_add;
	private int Cust_contact;
	private String Ship_info;
	private int pincode;
	private Date Est_del_date;
	private Date del_date;
	private String Order_id;
	private String Bill_id;
	private String Staff_id;
	private String C_id;
	public String getTracking_id() {
		return Tracking_id;
	}
	public void setTracking_id(String tracking_id) {
		Tracking_id = tracking_id;
	}
	public int getTrans_id() {
		return Trans_id;
	}
	public void setTrans_id(int trans_id) {
		Trans_id = trans_id;
	}
	public String getC_add() {
		return C_add;
	}
	public void setC_add(String c_add) {
		C_add = c_add;
	}
	public int getCust_contact() {
		return Cust_contact;
	}
	public void setCust_contact(int cust_contact) {
		Cust_contact = cust_contact;
	}
	public String getShip_info() {
		return Ship_info;
	}
	public void setShip_info(String ship_info) {
		Ship_info = ship_info;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Date getEst_del_date() {
		return Est_del_date;
	}
	public void setEst_del_date(Date est_del_date) {
		Est_del_date = est_del_date;
	}
	public Date getDel_date() {
		return del_date;
	}
	public void setDel_date(Date del_date) {
		this.del_date = del_date;
	}
	public String getOrder_id() {
		return Order_id;
	}
	public void setOrder_id(String order_id) {
		Order_id = order_id;
	}
	public String getBill_id() {
		return Bill_id;
	}
	public void setBill_id(String bill_id) {
		Bill_id = bill_id;
	}
	public String getStaff_id() {
		return Staff_id;
	}
	public void setStaff_id(String staff_id) {
		Staff_id = staff_id;
	}
	public String getC_id() {
		return C_id;
	}
	public void setC_id(String c_id) {
		C_id = c_id;
	}
	
}
