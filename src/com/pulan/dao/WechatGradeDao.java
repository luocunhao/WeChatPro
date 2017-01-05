package com.pulan.dao;

import java.util.List;

import com.pulan.entity.WechatGrade;

public interface WechatGradeDao {
    public List<WechatGrade> getAllWechatGrade();
    public void addWechatGrade(String grade);
	public void deleteAll();
}
