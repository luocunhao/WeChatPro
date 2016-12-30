package com.pulan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulan.dao.UserInfoDao;
import com.pulan.entity.UserInfo;
import com.pulan.service.UserInfoService;
@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Autowired
	private UserInfoDao userInfoDao;
	@Override
	public List<UserInfo> getUserInfos() {
		// TODO Auto-generated method stub
		return userInfoDao.getUserInfos();
	}

}
