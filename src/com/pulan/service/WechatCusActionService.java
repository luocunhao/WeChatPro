package com.pulan.service;

import java.util.List;

import com.pulan.entity.WechatCusAction;

public interface WechatCusActionService {
	 public List<WechatCusAction> getAllWechatCusAction();
	 public void addWechatCusAction(List<String> customers);
}
