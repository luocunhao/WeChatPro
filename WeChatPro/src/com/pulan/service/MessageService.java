package com.pulan.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.pulan.entity.Message;

public interface MessageService {
    public List<Message> getMessages();
    public void addMessage(HttpServletRequest request) throws Exception;
}
