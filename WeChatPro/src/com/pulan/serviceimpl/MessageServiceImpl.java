package com.pulan.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulan.controller.MessageController;
import com.pulan.dao.MessageDao;
import com.pulan.entity.Article;
import com.pulan.entity.Message;
import com.pulan.service.MessageService;
import com.pulan.utils.MessageResponse;
import com.pulan.utils.MessageUtil;
@Service
public class MessageServiceImpl implements MessageService{
	private static Logger logger = Logger.getLogger(MessageServiceImpl.class);
	@Autowired
    private MessageDao messageDao;
	@Override
	public List<Message> getMessages() {
		// TODO Auto-generated method stub
		return messageDao.getMessages();
	}
	@Override
	public void addMessage(Message message) {
		messageDao.addMessage(message);
	}
	
   
}
