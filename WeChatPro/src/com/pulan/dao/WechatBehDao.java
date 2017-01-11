package com.pulan.dao;

import java.util.List;

import com.pulan.entity.WechatBeh;

public interface WechatBehDao {
    public List<WechatBeh> getAllWechatBeh();
    public void addWechatBeh(String userinfo);
	public void deleteAll();
}
