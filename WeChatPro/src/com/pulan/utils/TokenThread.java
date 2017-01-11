package com.pulan.utils;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

import com.pulan.entity.AccessToken;


public class TokenThread implements Runnable{
    public static String appId = "";
    public static String appSecret = "";
    public static AccessToken accessToken = new AccessToken();
    private static Logger logger = Logger.getLogger(TokenThread.class);
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try{
                accessToken = this.getAccessToken();
                if(null!=accessToken){
                    Thread.sleep(7000 * 1000);
                     //获取到access_token 休眠7000秒
                }else{
              //获取的access_token为空 休眠3秒
                	Thread.sleep(1000*3); 
                }
            }catch(Exception e){
                System.out.println("发生异常："+e.getMessage());
                e.printStackTrace();
                try{
                    Thread.sleep(1000); //发生异常休眠1秒
                }catch (Exception e1){

                }
            }
		}
	}
	private AccessToken getAccessToken(){

        NetWorkHelper netHelper = new NetWorkHelper();

        String Url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appId+"&secret="+appSecret;

        JSONObject json = NetWorkHelper.httpsRequest(Url,"GET", null);
        AccessToken token = new AccessToken();
        try {
			token.setAccessToken(json.getString("access_token"));
			token.setExpiresin(json.getInt("expires_in"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return token;
    }
}
