package com.pulan.test;

import com.pulan.utils.TulingApiProcess;
import com.sun.xml.internal.ws.resources.TubelineassemblyMessages;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newrespMessage ="";
		String respMessage = "北京光年无限科技有限公司,CEO是俞志晨";
		if(respMessage.contains("北京光年无限科技有限公司")){
         newrespMessage = respMessage.replace("北京光年无限科技有限公司", "普兰大数据");
        }
		System.out.println(newrespMessage);
	}

}
