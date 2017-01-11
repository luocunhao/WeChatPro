package com.pulan.controller;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pulan.utils.NetWorkHelper;
import com.pulan.utils.ReadMenuUtil;
import com.pulan.utils.TokenThread;

@Controller
public class MenuController {
	private static Logger logger = Logger.getLogger(MenuController.class);
	@RequestMapping("createmenu")
    public void createmenu(){
		String outStr = ReadMenuUtil.ReadMenuStr("E://JavaWorkspace//WeChatPro//src//json//menu.json");
		String access_token = TokenThread.accessToken.getAccessToken();
		String Url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token="+access_token;
		JSONObject json = NetWorkHelper.httpsRequest(Url,"POST", outStr);
	    try {
			String errmsg = json.getString("errmsg");
			logger.info("errmsg:"+errmsg);
			System.out.println(errmsg);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
  //获取图文消息素材列表
	@RequestMapping("getsucailist")
    public void getsucailist(){
		String outStr = ReadMenuUtil.ReadMenuStr("E://JavaWorkspace//WeChatPro//src//json//sucailist.json");
		String access_token = TokenThread.accessToken.getAccessToken();
		String Url = "https://api.weixin.qq.com/cgi-bin/material/batchget_material?access_token="+access_token;
		JSONObject json = NetWorkHelper.httpsRequest(Url,"POST", outStr);
	    String errmsg = json.toString();
		System.out.println(errmsg);
    }
	 //获取菜单列表
		@RequestMapping("getmenulist")
	    public void getmenulist(){
			String access_token = TokenThread.accessToken.getAccessToken();
			String Url = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token="+access_token;
			JSONObject json = NetWorkHelper.httpsRequest(Url,"GET", null);
		    String errmsg = json.toString();
		    logger.info("menulist:"+errmsg);
			System.out.println(errmsg);
	    }
}
