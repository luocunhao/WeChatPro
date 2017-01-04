package com.pulan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulan.dao.WechatGradeDao;
import com.pulan.entity.WechatGrade;
import com.pulan.service.WechatGradeService;
@Service
public class WechatGradeServiceImpl implements WechatGradeService {
    @Autowired
    private WechatGradeDao wechatGradeDao;
	@Override
	public List<WechatGrade> getAllWechatGrade() {
		// TODO Auto-generated method stub
		return wechatGradeDao.getAllWechatGrade();
	}

}
