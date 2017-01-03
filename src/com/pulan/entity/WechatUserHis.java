package com.pulan.entity;

public class WechatUserHis {
    private int id;
    private String username;
    //用户行为
    private String userinfo;
    private String grade;
    //营销策略
    private String sales;
    private String customer;
	public WechatUserHis() {
		// TODO Auto-generated constructor stub
	}
	public WechatUserHis(int id, String username, String userinfo, String grade, String sales, String customer) {
		this.id = id;
		this.username = username;
		this.userinfo = userinfo;
		this.grade = grade;
		this.sales = sales;
		this.customer = customer;
	}
	public WechatUserHis(String username, String userinfo, String grade, String sales, String customer) {
		this.username = username;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
		return "WechatUserHis [id=" + id + ", username=" + username + ", userinfo=" + userinfo + ", grade=" + grade
				+ ", sales=" + sales + ", customer=" + customer + "]";
	}
	
    
}
