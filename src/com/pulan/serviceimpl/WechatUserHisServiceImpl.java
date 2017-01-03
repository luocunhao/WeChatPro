package com.pulan.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulan.dao.WechatUserHisDao;
import com.pulan.entity.WechatUserHis;
import com.pulan.service.WechatUserHisService;
@Service
public class WechatUserHisServiceImpl implements WechatUserHisService{
    @Autowired
	private WechatUserHisDao wechatUserHisDao;
	@Override
	public void addWechatUserHis(WechatUserHis wechatUserHis) {
		// TODO Auto-generated method stub
		wechatUserHisDao.addWechatUserHis(wechatUserHis);
	}
	@Override
	public WechatUserHis getNewUserBeh() {
		// TODO Auto-generated method stub
		return wechatUserHisDao.getNewUserBeh();
	}
    
}
