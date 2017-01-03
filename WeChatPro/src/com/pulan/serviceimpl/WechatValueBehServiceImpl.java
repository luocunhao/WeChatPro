package com.pulan.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulan.dao.WechatValueBehDao;
import com.pulan.entity.WechatValueBeh;
import com.pulan.service.WechatValueBehService;
@Service
public class WechatValueBehServiceImpl implements WechatValueBehService{
    @Autowired
	private WechatValueBehDao wechatValueBehDao;
	@Override
	public WechatValueBeh getWechatValueBehByEventType(String event_type) {
		// TODO Auto-generated method stub
		return wechatValueBehDao.getWechatValueBehByEventType(event_type);
	}

}
