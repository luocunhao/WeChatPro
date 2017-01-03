package com.pulan.entity;

public class WechatValueBeh {
   private int id;
   private String event_type;
   private String usernfo;
   private String grade;
   private String sales;
   private String customer;
public WechatValueBeh() {
	// TODO Auto-generated constructor stub
}
public WechatValueBeh(int id, String event_type, String usernfo, String grade, String sales, String customer) {
	this.id = id;
	this.event_type = event_type;
	this.usernfo = usernfo;
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
public String getUsernfo() {
	return usernfo;
}
public void setUsernfo(String usernfo) {
	this.usernfo = usernfo;
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
	return "WechatValueBeh [id=" + id + ", event_type=" + event_type + ", usernfo=" + usernfo + ", grade=" + grade
			+ ", sales=" + sales + ", customer=" + customer + "]";
}
   
}
