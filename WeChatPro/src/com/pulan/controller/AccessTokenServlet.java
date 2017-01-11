package com.pulan.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pulan.utils.TokenThread;
@WebServlet("/AccessTokenServlet")
public class AccessTokenServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 public void init() throws ServletException {
	        TokenThread.appId = getInitParameter("appid"); 
	         //��ȡservlet��ʼ����appid��appsecret
	        TokenThread.appSecret = getInitParameter("appsecret");
	        new Thread(new TokenThread()).start(); //��������
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    }
}
