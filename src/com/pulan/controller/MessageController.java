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
import com.pulan.service.CoreService;
import com.pulan.service.MessageService;
import com.pulan.serviceimpl.MessageServiceImpl;
import com.pulan.utils.MessageUtil;
import com.pulan.utils.SignUtil;



@Controller
@RequestMapping("/test")
public class MessageController {
	private static Logger logger = Logger.getLogger(MessageController.class);
	@Autowired
   private MessageService messageServiceImpl;
//    @RequestMapping(value="getMessages")
//    public String getMessages(ModelMap mm){
//    	List<Message> list = messageServiceImpl.getMessages();
//    	System.out.println(list.get(0).toString());
//    	return "";
//    }
    @RequestMapping(value="/lch",method={RequestMethod.GET})
    @ResponseBody
    public String validate(HttpServletRequest request,HttpServletResponse response) throws IOException{
    	 // ΢�ż���ǩ��  
	       String signature = request.getParameter("signature"); 
	     // ʱ���  
	        String timestamp = request.getParameter("timestamp");  
	       // �����  
	       String nonce = request.getParameter("nonce");  
	       // ����ַ���  
	      String echostr = request.getParameter("echostr");  
	      logger.info(signature+","+timestamp+","+nonce+","+echostr);
	      // PrintWriter out = response.getWriter();  
	       // ͨ������signature���������У�飬��У��ɹ���ԭ������echostr����ʾ����ɹ����������ʧ��  
	       logger.info(SignUtil.checkSignature(signature, timestamp, nonce));
	       if (SignUtil.checkSignature(signature, timestamp, nonce)) { 
	    	  logger.info(echostr);
	    	//  out.print("�໥��֤�ɹ�");
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
    	// ��������Ӧ�ı��������ΪUTF-8����ֹ�������룩  
         //΢�ŷ�����POST��Ϣʱ�õ���UTF-8���룬�ڽ���ʱҲҪ��ͬ���ı��룬�������Ļ����룻
       // response.setCharacterEncoding("UTF-8"); //����Ӧ��Ϣ���ظ���Ϣ���û���ʱ��Ҳ�����뷽ʽ����ΪUTF-8��ԭ��ͬ�ϣ�
        //��ʼ�������ļ�
        String respMessage = CoreService.processRequest(request);//����CoreService���processRequest�������ա�������Ϣ�����õ����������
        messageServiceImpl.addMessage(request);
        // ��Ӧ��Ϣ  
        //����response.getWriter().write()��������Ϣ�Ĵ���������ظ��û�
        
    //	MessageUtil.message(request,response);
    	return respMessage;
    }
}