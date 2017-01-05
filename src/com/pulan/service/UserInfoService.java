package com.pulan.service;

import java.util.List;

import com.pulan.entity.UserInfo;

public interface UserInfoService {
    public List<UserInfo> getUserInfos();

	public void addUserInfo(String fromUserName);
}
