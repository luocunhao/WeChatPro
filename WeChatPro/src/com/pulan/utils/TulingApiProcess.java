package com.pulan.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONException;
import org.json.JSONObject;





/**
 * ����ͼ�������api�ӿڣ���ȡ���ܻظ�����
 * @author pamchen-1
 *
 */
public class TulingApiProcess {
	/**
	 * ����ͼ�������api�ӿڣ���ȡ���ܻظ����ݣ�������ȡ�Լ�������
	 * @param content
	 * @return
	 */
	public static String getTulingResult(String content){
		//ͼ����������ݿ�ӿ�
		String APIKEY = "438cc658c632496fa4dc33511cb2674d";
		StringBuffer sb = new StringBuffer();
		String result = "";
		try {
			String INFO = URLEncoder.encode(content, "utf-8"); 
			String getURL = "http://www.tuling123.com/openapi/api?key="
					+ APIKEY + "&info=" + INFO;
			URL getUrl = new URL(getURL);
			HttpURLConnection connection = (HttpURLConnection) getUrl
					.openConnection();
			connection.connect();

			// ȡ������������ʹ��Reader��ȡ
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					connection.getInputStream(), "utf-8"));

			String line = "";
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			reader.close();
			// �Ͽ�����
			connection.disconnect();
			JSONObject json = new JSONObject(sb.toString());
			result = json.getString("text");

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
}