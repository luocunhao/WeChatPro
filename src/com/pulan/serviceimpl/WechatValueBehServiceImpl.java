package com.pulan.serviceimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulan.dao.WechatValueBehDao;
import com.pulan.entity.WechatValueBeh;
import com.pulan.service.WechatValueBehService;
@Service
public class WechatValueBehServiceImpl implements WechatValueBehService{
	private static Logger logger = Logger.getLogger(WechatValueBehServiceImpl.class);
    @Autowired
	private WechatValueBehDao wechatValueBehDao;
	@Override
	public WechatValueBeh getWechatValueBehByEventType(String event_type) {
		// TODO Auto-generated method stub
		return wechatValueBehDao.getWechatValueBehByEventType(event_type);
	}
	@Override
	public void updateWcValBeh(WechatValueBeh wechatValueBeh) {
		// TODO Auto-generated method stub
		List<String> userinfos =  wechatValueBehDao.getAllUseriInfo();
		if(userinfos.contains(wechatValueBeh.getUserinfo())){
			logger.info("true");
		wechatValueBehDao.updateWcValBeh(wechatValueBeh);
		}else{
			wechatValueBehDao.addWcValBeh(wechatValueBeh);
		}
	}

}
