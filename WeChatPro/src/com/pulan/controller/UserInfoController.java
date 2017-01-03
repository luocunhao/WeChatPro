package com.pulan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pulan.entity.UserInfo;
import com.pulan.service.UserInfoService;

@Controller
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoServiceImpl;
    @RequestMapping("getUserInfos")
    @ResponseBody
	public List<UserInfo> getUserInfos(){
		List<UserInfo> list = userInfoServiceImpl.getUserInfos();
		System.out.println(list.get(0).toString());
    	return list;
    }
}
