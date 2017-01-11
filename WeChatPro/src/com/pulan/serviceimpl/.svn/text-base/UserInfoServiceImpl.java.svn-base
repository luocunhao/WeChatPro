package com.pulan.serviceimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulan.dao.UserInfoDao;
import com.pulan.entity.UserInfo;
import com.pulan.service.UserInfoService;
import com.pulan.utils.NetWorkHelper;
import com.pulan.utils.TokenThread;
@Service
public class UserInfoServiceImpl implements UserInfoService{
	private static Logger logger = Logger.getLogger(UserInfoServiceImpl.class);
    @Autowired
	private UserInfoDao userInfoDao;
	@Override
	public List<UserInfo> getUserInfos() {
		// TODO Auto-generated method stub
		return userInfoDao.getUserInfos();
	}
	@Override
	public void addUserInfo(String fromUserName) {
		// TODO Auto-generated method stub
		List<String> list = userInfoDao.getAllOpenId();
		if(!list.contains(fromUserName)){
		String access_token = TokenThread.accessToken.getAccessToken();
		logger.info("access_token"+access_token);
		String Url = "https://api.weixin.qq.com/cgi-bin/user/info?access_token="+access_token+"&openid="+fromUserName+"&lang=zh_CN";
		logger.info("url:"+Url);
		JSONObject jsonObject = NetWorkHelper.httpsRequest(Url,"GET", null);
		try {
		String subscribe =	jsonObject.getString("subscribe");
		String openid = jsonObject.getString("openid");
		String nickname = jsonObject.getString("nickname");
		String sex = jsonObject.getString("sex");
		String language = jsonObject.getString("language");
		String city = jsonObject.getString("city");
		String province = jsonObject.getString("province");
		String country = jsonObject.getString("country");
		String headimgurl = jsonObject.getString("headimgurl");
		String subscribe_time = jsonObject.getString("subscribe_time");
		//String unionid = jsonObject.getString("unionid");
		String remark = jsonObject.getString("remark");
		String groupid = jsonObject.getString("groupid");
		UserInfo userInfo = new UserInfo(subscribe,openid, nickname, sex, language, city,
				province, country, headimgurl, subscribe_time, "hehe", remark, groupid);
		logger.info("userinfo:"+userInfo.toString());
		userInfoDao.addUserInfo(userInfo);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
				logger.info("invalid credential, access_token is invalid");
			
		}
		System.out.println("false");
		}
	}

}
