package com.pulan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulan.dao.WechatCusActionDao;
import com.pulan.entity.WechatCusAction;
import com.pulan.service.WechatCusActionService;
@Service
public class WechatCusActionServiceImpl implements WechatCusActionService {
    @Autowired
    private WechatCusActionDao wechatCusActionDao;
	@Override
	public List<WechatCusAction> getAllWechatCusAction() {
		// TODO Auto-generated method stub
		return wechatCusActionDao.getAllWechatCusAction();
	}

}
