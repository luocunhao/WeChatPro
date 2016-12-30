package com.pulan.entity;

public class UserInfo {
    private int id;
    private String openid;
    private String nickname;
    private String sex;
    private String language;
    private String city;
    private String province;
    private String country;
    private String headimgurl;
    private String subscribe;
    private String unionid;
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	public UserInfo(int id, String openid, String nickname, String sex, String language, String city, String province,
			String country, String headimgurl, String subscribe, String unionid) {
		this.id = id;
		this.openid = openid;
		this.nickname = nickname;
		this.sex = sex;
		this.language = language;
		this.city = city;
		this.province = province;
		this.country = country;
		this.headimgurl = headimgurl;
		this.subscribe = subscribe;
		this.unionid = unionid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHeadimgurl() {
		return headimgurl;
	}
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	public String getSubscribe() {
		return subscribe;
	}
	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}
	public String getUnionid() {
		return unionid;
	}
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", openid=" + openid + ", nickname=" + nickname + ", sex=" + sex + ", language="
				+ language + ", city=" + city + ", province=" + province + ", country=" + country + ", headimgurl="
				+ headimgurl + ", subscribe=" + subscribe + ", unionid=" + unionid + "]";
	}
    
}
