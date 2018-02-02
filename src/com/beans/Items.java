package com.beans;

import java.util.Date;

public class Items {
	private String Item_id;
	private String i_name;
	private String i_category;
	private int stock;
	private int purchase_price;
	private int MRP;
	private String item_description;
	private String mf_date;
	private String exp_date;
	private String D_id;
	private String A_id;
	public String getItem_id() {
		return Item_id;
	}
	public void setItem_id(String item_id) {
		Item_id = item_id;
	}
	public String getI_name() {
		return i_name;
	}
	public void setI_name(String i_name) {
		this.i_name = i_name;
	}
	public String getI_category() {
		return i_category;
	}
	public void setI_category(String i_category) {
		this.i_category = i_category;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getPurchase_price() {
		return purchase_price;
	}
	public void setPurchase_price(int purchase_price) {
		this.purchase_price = purchase_price;
	}
	public int getMRP() {
		return MRP;
	}
	public void setMRP(int mRP) {
		MRP = mRP;
	}
	public String getItem_description() {
		return item_description;
	}
	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}
	public String getMf_date() {
		return mf_date;
	}
	public void setMf_date(String mf_date) {
		this.mf_date = mf_date;
	}
	public String getExp_date() {
		return exp_date;
	}
	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}
	public String getD_id() {
		return D_id;
	}
	public void setD_id(String d_id) {
		D_id = d_id;
	}
	public String getA_id() {
		return A_id;
	}
	public void setA_id(String a_id) {
		A_id = a_id;
	}
	
}
