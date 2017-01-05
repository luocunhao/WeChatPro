package com.pulan.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulan.dao.WechatSalesActionDao;
import com.pulan.entity.WechatBeh;
import com.pulan.entity.WechatSalesAction;
import com.pulan.service.WechatSalesActionService;
@Service
public class WechatSalesActionServiceImpl implements WechatSalesActionService {
    @Autowired
    private WechatSalesActionDao wechatSalesActionDao;

	@Override
	public List<WechatSalesAction> getAllWechatSalesAction() {
		// TODO Auto-generated method stub
		return wechatSalesActionDao.getAllWechatSalesAction();
	}

	@Override
	public void addWechatSales(List<String> sales) {
		// TODO Auto-generated method stub
		wechatSalesActionDao.deleteAll();
		for(String sale:sales){
			wechatSalesActionDao.addWechatSales(sale);
		}
	}
	
	}


