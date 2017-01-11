package com.pulan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pulan.entity.WechatUserHis;
import com.pulan.entity.WechatValueBeh;

public interface WechatUserHisDao {
   public void addWechatUserHis(WechatUserHis wechatUserHis);
   public WechatUserHis getNewUserBeh();
   public List<WechatUserHis> getAllUserHis();
   public List<WechatUserHis> getUserHisForPage(@Param("page") int page);
   public void updateByWcValBeh(WechatValueBeh wechatValueBeh);
}
