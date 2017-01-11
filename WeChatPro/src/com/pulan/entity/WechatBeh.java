package com.pulan.entity;

public class WechatBeh {
    private int id;
    private String userinfo;
	public WechatBeh() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(String userinfo) {
		this.userinfo = userinfo;
	}
	@Override
	public String toString() {
		return "WechatBeh [id=" + id + ", userinfo=" + userinfo + "]";
	}
    
}
