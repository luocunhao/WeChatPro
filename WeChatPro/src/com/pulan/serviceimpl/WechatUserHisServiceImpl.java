package com.pulan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulan.dao.UserInfoDao;
import com.pulan.dao.WechatUserHisDao;
import com.pulan.entity.WechatUserHis;
import com.pulan.entity.WechatValueBeh;
import com.pulan.service.WechatUserHisService;
@Service
public class WechatUserHisServiceImpl implements WechatUserHisService{
    @Autowired
	private WechatUserHisDao wechatUserHisDao;
    @Autowired
    private UserInfoDao userInfoDao;
	@Override
	public void addWechatUserHis(WechatUserHis wechatUserHis) {
		// TODO Auto-generated method stub
		String username = userInfoDao.getUsernameByOpenid(wechatUserHis.getUsername());
		wechatUserHis.setUsername(username);
		wechatUserHisDao.addWechatUserHis(wechatUserHis);
	}
	@Override
	public WechatUserHis getNewUserBeh() {
		// TODO Auto-generated method stub
//		WechatUserHis wechatUserHis = wechatUserHisDao.getNewUserBeh();
//		String username = userInfoDao.getUsernameByOpenid(wechatUserHis.getUsername());
//		wechatUserHis.setUsername(username);
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
	@Override
	public void updateByWcValBeh(WechatValueBeh wechatValueBeh) {
		// TODO Auto-generated method stub
		wechatUserHisDao.updateByWcValBeh(wechatValueBeh);
	}
    
}
