package com.pulan.dao;

import java.util.List;

import com.pulan.entity.Message;

public interface MessageDao {
    public List<Message> getMessages();
    public void addMessage(Message message);
}
