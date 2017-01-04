package com.pulan.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pulan.entity.WechatBeh;
import com.pulan.entity.WechatCusAction;
import com.pulan.entity.WechatGrade;
import com.pulan.entity.WechatSalesAction;
import com.pulan.entity.WechatUserHis;
import com.pulan.entity.WechatValueBeh;
import com.pulan.service.WechatBehService;
import com.pulan.service.WechatCusActionService;
import com.pulan.service.WechatGradeService;
import com.pulan.service.WechatSalesActionService;
import com.pulan.service.WechatUserHisService;
import com.pulan.service.WechatValueBehService;

@Controller
public class WechatController {
	@Autowired
	private WechatUserHisService wechatUserHisServiceImpl;
	@Autowired
	private WechatBehService wechatBehServiceImpl;
	@Autowired
	private WechatCusActionService wechatCusActionServiceImpl;
	@Autowired
	private WechatSalesActionService wechatSalesActionServiceImpl;
	@Autowired
	private WechatGradeService wechatGradeServiceImpl;
    @RequestMapping("getNewUserBeh")
    @ResponseBody
	public WechatUserHis getNewUserBeh(){
    	WechatUserHis wechatUserHis = wechatUserHisServiceImpl.getNewUserBeh();
    	return wechatUserHis;
    };
    @RequestMapping("getAllUserHis")
    @ResponseBody
    public List<WechatUserHis> getAllUserHis(){
    	List<WechatUserHis> list= wechatUserHisServiceImpl.getAllUserHis();
    	return list;
    }
    @RequestMapping("getUserHisForPage")
    @ResponseBody
    public List<WechatUserHis> getUserHisForPage(int page){
    	List<WechatUserHis> list= wechatUserHisServiceImpl.getUserHisForPage(page);
    	return list;
    }
    @RequestMapping("getFourObj")
    @ResponseBody
    public List<Object> getFourObj(){
    	List<Object> list = new ArrayList<Object>(); 
    	List<WechatBeh> list1= wechatBehServiceImpl.getAllWechatBeh();
    	List<WechatCusAction> list2 = wechatCusActionServiceImpl.getAllWechatCusAction();
    	List<WechatSalesAction> list3 = wechatSalesActionServiceImpl.getAllWechatSalesAction();
    	List<WechatGrade> list4 = wechatGradeServiceImpl.getAllWechatGrade();
    	list.add(list1);
    	list.add(list2);
    	list.add(list3);
    	list.add(list4);
    	return list;
    }
    @RequestMapping("addFourObj")
    public void addFourObj(HttpServletRequest request){
       
    }
}
