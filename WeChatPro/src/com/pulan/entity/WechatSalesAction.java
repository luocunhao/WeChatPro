package com.pulan.entity;

public class WechatSalesAction {
    private int id;
    private String sales;
	public WechatSalesAction() {
		// TODO Auto-generated constructor stub
	}
	public WechatSalesAction(int id, String sales) {
		this.id = id;
		this.sales = sales;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSales() {
		return sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}
	@Override
	public String toString() {
		return "WechatSalesAction [id=" + id + ", sales=" + sales + "]";
	}
    
}
