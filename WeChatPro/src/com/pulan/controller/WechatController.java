package com.pulan.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pulan.dao.WechatValueBehDao;
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
import com.pulan.utils.Strings2listUtil;

@Controller
public class WechatController {
	private static Logger logger = Logger.getLogger(MessageController.class);
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
	@Autowired
	private WechatValueBehService wechatValueBehServiceImpl;
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
    	int page1 =(page-1)*10;
    	List<WechatUserHis> list= wechatUserHisServiceImpl.getUserHisForPage(page1);
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
    @ResponseBody
    public WechatUserHis addFourObj(HttpServletRequest request){
       String[] userinfos = request.getParameterValues("userinfo");
       String[] grades = request.getParameterValues("grade");
       String[] customers = request.getParameterValues("customer");
       String[] sales = request.getParameterValues("sales");
       wechatBehServiceImpl.addWechatBeh(Strings2listUtil.Strings2list(userinfos));
       wechatCusActionServiceImpl.addWechatCusAction(Strings2listUtil.Strings2list(customers));
       wechatGradeServiceImpl.addWechatGrade(Strings2listUtil.Strings2list(grades));
       wechatSalesActionServiceImpl.addWechatSales(Strings2listUtil.Strings2list(sales));
       //只为返回一个对象 没有任何实际意义
       return new WechatUserHis();
    }
    @RequestMapping("updateWcValBeh")
    @ResponseBody
    public WechatUserHis updateWcValBeh(WechatValueBeh wechatValueBeh){
//    	String event_type = request.getParameter("event_type");
//    	String userinfo = request.getParameter("userinfo");
//    	String grade = request.getParameter("grade");
//    	String customer = request.getParameter("customer");
//    	String sales = request.getParameter("sales");
    	wechatValueBehServiceImpl.updateWcValBeh(wechatValueBeh);
    	wechatUserHisServiceImpl.updateByWcValBeh(wechatValueBeh);
    	//只为返回一个对象 没有任何实际意义
    	return new WechatUserHis();
    }
    
}
