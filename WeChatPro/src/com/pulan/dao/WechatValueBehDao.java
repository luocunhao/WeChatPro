package com.pulan.dao;

import com.pulan.entity.WechatValueBeh;

public interface WechatValueBehDao {
    public WechatValueBeh getWechatValueBehByEventType(String event_type);
}
