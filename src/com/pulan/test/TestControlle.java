package com.pulan.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pulan.dao.UserInfoDao;
import com.pulan.entity.UserInfo;

@Controller
public class TestControlle {
    @Autowired
    private UserInfoDao userinfodao;
    @RequestMapping("test")
    public void test(UserInfo userinfo){
    	System.out.println(userinfo.toString());
    	userinfodao.addUserInfo(userinfo);
    }
}
