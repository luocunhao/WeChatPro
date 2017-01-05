package com.pulan.service;

import java.util.List;

import com.pulan.entity.WechatUserHis;
import com.pulan.entity.WechatValueBeh;

public interface WechatUserHisService {
    public void addWechatUserHis(WechatUserHis wechatUserHis);
    public WechatUserHis getNewUserBeh();
	public List<WechatUserHis> getAllUserHis();
	public List<WechatUserHis> getUserHisForPage(int page);
	public void updateByWcValBeh(WechatValueBeh wechatValueBeh);
}
