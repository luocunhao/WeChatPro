package com.pulan.serviceimpl;

import java.util.List;

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
		System.out.println(wechatUserHis.toString());
		wechatUserHisDao.addWechatUserHis(wechatUserHis);
	}
	@Override
	public WechatUserHis getNewUserBeh() {
		// TODO Auto-generated method stub
		return wechatUserHisDao.getNewUserBeh();
	}
	@Override
	public List<WechatUserHis> getAllUserHis() {
		// TODO Auto-generated method stub
		return wechatUserHisDao.getAllUserHis();
	}
	@Override
	public List<WechatUserHis> getUserHisForPage(int page) {
		// TODO Auto-generated method stub
		return wechatUserHisDao.getUserHisForPage(page);
	}
    
}
