package com.pulan.test;

import com.pulan.utils.TulingApiProcess;
import com.sun.xml.internal.ws.resources.TubelineassemblyMessages;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newrespMessage ="";
		String respMessage = "�����������޿Ƽ����޹�˾,CEO����־��";
		if(respMessage.contains("�����������޿Ƽ����޹�˾")){
         newrespMessage = respMessage.replace("�����������޿Ƽ����޹�˾", "����������");
        }
		System.out.println(newrespMessage);
	}

}
