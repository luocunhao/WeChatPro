package com.pulan.dao;

import java.util.List;

import com.pulan.entity.UserInfo;

public interface UserInfoDao {
    public List<UserInfo> getUserInfos();

	public void addUserInfo(UserInfo userInfo);

	public List<String> getAllOpenId();

	public String getUsernameByOpenid(String username);
}
