package com.pulan.service;

import com.pulan.entity.WechatValueBeh;

public interface WechatValueBehService {
	public WechatValueBeh getWechatValueBehByEventType(String event_type);

	public void updateWcValBeh(WechatValueBeh wechatValueBeh);
}
