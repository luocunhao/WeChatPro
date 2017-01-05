package com.pulan.dao;

import java.util.List;

import com.pulan.entity.WechatSalesAction;

public interface WechatSalesActionDao {
    public List<WechatSalesAction> getAllWechatSalesAction();
    public void addWechatSales(String sales);
	public void deleteAll();
}
