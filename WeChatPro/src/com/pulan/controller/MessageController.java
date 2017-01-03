package com.pulan.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pulan.entity.Message;
import com.pulan.entity.WechatUserHis;
import com.pulan.entity.WechatValueBeh;
import com.pulan.service.CoreService;
import com.pulan.service.MessageService;
import com.pulan.service.WechatUserHisService;
import com.pulan.service.WechatValueBehService;
import com.pulan.serviceimpl.MessageServiceImpl;
import com.pulan.utils.MessageUtil;
import com.pulan.utils.SignUtil;



@Controller
@RequestMapping("/test")
public class MessageController {
	private static Logger logger = Logger.getLogger(MessageController.class);
	@Autowired
    private MessageService messageServiceImpl;
	@Autowired
	private WechatValueBehService wechatValueBehServiceImpl;
	@Autowired
	private WechatUserHisService WechatUserHisServiceImpl;
    @RequestMapping(value="getMessages")
    public String getMessages(ModelMap mm){
    	List<Message> list = messageServiceImpl.getMessages();
    	System.out.println(list.get(0).toString());
    	return "";
    }
    @RequestMapping(value="/lch",method={RequestMethod.GET})
    @ResponseBody
    public String validate(HttpServletRequest request,HttpServletResponse response) throws IOException{
    	 // 微信加密签名  
	       String signature = request.getParameter("signature"); 
	     // 时间戳  
	        String timestamp = request.getParameter("timestamp");  
	       // 随机数  
	       String nonce = request.getParameter("nonce");  
	       // 随机字符串  
	      String echostr = request.getParameter("echostr");  
	      logger.info(signature+","+timestamp+","+nonce+","+echostr);
	      // PrintWriter out = response.getWriter();  
	       // 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败  
	       logger.info(SignUtil.checkSignature(signature, timestamp, nonce));
	       if (SignUtil.checkSignature(signature, timestamp, nonce)) { 
	    	  logger.info(echostr);
	    	//  out.print("相互认证成功");
	        //  out.print(echostr);  
	    	  return echostr;
	        }else{
	        	return null;
	        }  
        // out.close();
	      // out = null;
    }
    @RequestMapping(value="/lch",method={RequestMethod.POST})
    @ResponseBody
    public String addMessages(HttpServletRequest request,HttpServletResponse response) throws Exception, IOException{
    	logger.info("dopost");
    	// 将请求、响应的编码均设置为UTF-8（防止中文乱码）  
         //微信服务器POST消息时用的是UTF-8编码，在接收时也要用同样的编码，否则中文会乱码；
       // response.setCharacterEncoding("UTF-8"); //在响应消息（回复消息给用户）时，也将编码方式设置为UTF-8，原理同上；
        //初始化配置文件
    	Message message = MessageUtil.request2Message(request);
    	WechatValueBeh wechatValueBeh = wechatValueBehServiceImpl.getWechatValueBehByEventType(message.getContent());
    	if(wechatValueBeh!=null){
    	WechatUserHis wechatUserHis = new WechatUserHis(message.getFromUserName(),wechatValueBeh.getUsernfo(),
    			wechatValueBeh.getGrade(),wechatValueBeh.getSales(),wechatValueBeh.getCustomer());
    	WechatUserHisServiceImpl.addWechatUserHis(wechatUserHis);
    	}
    	messageServiceImpl.addMessage(message);
        String respMessage = CoreService.processRequest(message);//调用CoreService类的processRequest方法接收、处理消息，并得到处理结果；
        // 响应消息  
        //调用response.getWriter().write()方法将消息的处理结果返回给用户
        
        //	MessageUtil.message(request,response);
        logger.info(respMessage);
    	return respMessage;
    }
    
}
