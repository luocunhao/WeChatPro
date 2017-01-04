package com.pulan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulan.dao.WechatBehDao;
import com.pulan.entity.WechatBeh;
import com.pulan.service.WechatBehService;
@Service
public class WechatBehServiceImpl implements WechatBehService {
    @Autowired
    private WechatBehDao wechatBehDao;
	@Override
	public List<WechatBeh> getAllWechatBeh() {
		// TODO Auto-generated method stub
		return wechatBehDao.getAllWechatBeh();
	}

}
