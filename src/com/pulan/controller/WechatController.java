package com.pulan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pulan.entity.WechatUserHis;
import com.pulan.service.WechatUserHisService;

@Controller
public class WechatController {
	@Autowired
	private WechatUserHisService wechatUserHisServiceImpl;
    @RequestMapping("getNewUserBeh")
    @ResponseBody
	public WechatUserHis getNewUserBeh(){
    	WechatUserHis wechatUserHis = wechatUserHisServiceImpl.getNewUserBeh();
    	return wechatUserHis;
    };
}
