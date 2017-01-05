package com.pulan.dao;

import java.util.List;

import com.pulan.entity.WechatCusAction;

public interface WechatCusActionDao {
    public List<WechatCusAction> getAllWechatCusAction();
    public void addWechatCusAction(String customer);
	public void deleteAll();
}
