package com.pulan.entity;

public class WechatCusAction {
    private int id;
    private String customer;
	public WechatCusAction() {
	}
	public WechatCusAction(int id, String customer) {
		this.id = id;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "WechatCusAction [id=" + id + ", customer=" + customer + "]";
	}
    
}
