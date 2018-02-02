package com.beans;

import java.util.Date;

public class Feedback {
	private String Fd_id;
	private String C_id;
	private String fd_info;
	private int Rating;
	private String Comments;
	private String Feedback_date;
	public String getFd_id() {
		return Fd_id;
	}
	public void setFd_id(String fd_id) {
		Fd_id = fd_id;
	}
	public String getC_id() {
		return C_id;
	}
	public void setC_id(String c_id) {
		C_id = c_id;
	}
	public String getFd_info() {
		return fd_info;
	}
	public void setFd_info(String fd_info) {
		this.fd_info = fd_info;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public String getFeedback_date() {
		return Feedback_date;
	}
	public void setFeedback_date(String feedback_date) {
		Feedback_date = feedback_date;
	}
	
	
}
