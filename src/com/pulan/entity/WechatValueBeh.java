package com.pulan.entity;

public class WechatValueBeh {
   private int id;
   private String event_type;
   private String userinfo;
   private String grade;
   private String sales;
   private String customer;
public WechatValueBeh() {
	// TODO Auto-generated constructor stub
}

public WechatValueBeh(int id, String event_type, String userinfo, String grade, String sales, String customer) {
	this.id = id;
	this.event_type = event_type;
	this.userinfo = userinfo;
	this.grade = grade;
	this.sales = sales;
	this.customer = customer;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEvent_type() {
	return event_type;
}
public void setEvent_type(String event_type) {
	this.event_type = event_type;
}

public String getUserinfo() {
	return userinfo;
}

public void setUserinfo(String userinfo) {
	this.userinfo = userinfo;
}

public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getSales() {
	return sales;
}
public void setSales(String sales) {
	this.sales = sales;
}
public String getCustomer() {
	return customer;
}
public void setCustomer(String customer) {
	this.customer = customer;
}

@Override
public String toString() {
	return "WechatValueBeh [id=" + id + ", event_type=" + event_type + ", userinfo=" + userinfo + ", grade=" + grade
			+ ", sales=" + sales + ", customer=" + customer + "]";
}

}
