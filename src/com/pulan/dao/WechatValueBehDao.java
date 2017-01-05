package com.pulan.dao;

import java.util.List;

import com.pulan.entity.WechatValueBeh;

public interface WechatValueBehDao {
    public WechatValueBeh getWechatValueBehByEventType(String event_type);

	public void updateWcValBeh(WechatValueBeh wechatValueBeh);
	
	public List<String> getAllUseriInfo();

	public void addWcValBeh(WechatValueBeh wechatValueBeh);
}
