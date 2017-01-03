package com.pulan.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.pulan.entity.Article;
import com.pulan.entity.Message;
import com.pulan.entity.NewsMessage;
import com.pulan.entity.TextMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

import net.sf.json.JSONObject;


public class MessageUtil {
	/** 
     * 返回消息类型：文本 
     */  
    public static final String RESP_MESSAGE_TYPE_TEXT = "text";  
  
    /** 
     * 返回消息类型：音乐 
     */   
    public static final String RESP_MESSAGE_TYPE_MUSIC = "music";  
  
    /** 
     * 返回消息类型：图文 
     */  
    public static final String RESP_MESSAGE_TYPE_NEWS = "news";  
  

    /** 
     * 请求消息类型：文本 
     */  
    public static final String REQ_MESSAGE_TYPE_TEXT = "text";  
  
    /** 
     * 请求消息类型：图片 
     */  
    public static final String REQ_MESSAGE_TYPE_IMAGE = "image";  
    /** 
     * 请求消息类型：链接 
     */  
    public static final String REQ_MESSAGE_TYPE_LINK = "link";  
  

    /** 
     * 请求消息类型：地理位置 
     */  
    public static final String REQ_MESSAGE_TYPE_LOCATION = "location";  
    /** 
     * 请求消息类型：音频 
     */  
    public static final String REQ_MESSAGE_TYPE_VOICE = "voice";  
    /** 
     * 请求消息类型：视频 
     */  
    public static final String REQ_MESSAGE_TYPE_VIDEO = "video";  
    /** 
     * 请求消息类型：小视频 
     */  
    public static final String REQ_MESSAGE_TYPE_SHORTVIDEO = "shortvideo";  
  
    /** 
     * 请求消息类型：推送 
     */  
    public static final String REQ_MESSAGE_TYPE_EVENT = "event";  
  

    /** 
     * 事件类型：subscribe(订阅) 
     */  
    public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";  
  
    /** 
     * 事件类型：unsubscribe(取消订阅) 
     */  
    public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";  
  
    /** 
     * 事件类型：CLICK(自定义菜单点击事件) 
     */  
    public static final String EVENT_TYPE_CLICK = "CLICK";  
  
	private static Logger logger = Logger.getLogger(MessageUtil.class);
	 /** 
     * 解析微信发来的请求（XML） 
     *  
     * @param request 
     * @return 
     * @throws Exception 
     */  
	 public static Map<String, String> parseXml(HttpServletRequest request) throws Exception {  
		// 将解析结果存储在HashMap中  
	        Map<String, String> map = new HashMap<String, String>();  
	  
	        // 从request中取得输入流 
	        InputStream inputStream = request.getInputStream();  
	       
	        SAXReader reader = new SAXReader();  
	        Document document = reader.read(inputStream);  
	      
	        Element root = document.getRootElement();  
	     
	        List<Element> elementList = root.elements();  
	  
	        for (Element e : elementList)  
	            map.put(e.getName(), e.getText());  
	  
	        inputStream.close();  
	        inputStream = null;
	        return map;  
	    }  
	  
	 /** 
	     * 文本消息对象转换成xml 
	     *  
	     * @param textMessage 文本消息对象 
	     * @return xml 
	     */  
	    public static String textMessageToXml(TextMessage textMessage) {  
	        xstream.alias("xml", textMessage.getClass());  
	        return xstream.toXML(textMessage);  
	    }  
	  
	    /** 
	     * 音乐消息对象转换成xml 
	     *  
	     * @param musicMessage 音乐消息对象 
	     * @return xml 
	     */  
	   /* public static String musicMessageToXml(MusicMessage musicMessage) {  
	        xstream.alias("xml", musicMessage.getClass());  
	        return xstream.toXML(musicMessage);  
	    }  */
	  
	    /** 
	     * 图文消息对象转换成xml 
	     *  
	     * @param newsMessage 图文消息对象 
	     * @return xml 
	     */  
	    public static String newsMessageToXml(NewsMessage newsMessage) {  
	        xstream.alias("xml", newsMessage.getClass());  
	        xstream.alias("item", new Article().getClass());  
	        return xstream.toXML(newsMessage);  
	    }  

	    /** 
	     * 扩展xstream，使其支持CDATA块 
	     *  
	     */   
	    private static XStream xstream = new XStream(new XppDriver() {  
	        public HierarchicalStreamWriter createWriter(Writer out) {  
	            return new PrettyPrintWriter(out) {  
	            	  // 对所有xml节点的转换都增加CDATA标记   
	                boolean cdata = true;  
	  
	                @SuppressWarnings("unchecked")  
	                public void startNode(String name, Class clazz) {  
	                    super.startNode(name, clazz);
//	                	super.startNode(name);  
	                }  
	  
	                protected void writeText(QuickWriter writer, String text) {  
	                    if (cdata) {  
	                        writer.write("<![CDATA[");  
	                        writer.write(text);  
	                        writer.write("]]>");  
	                    } else {  
	                        writer.write(text);  
	                    }  
	                }  
	            };  
	        }  
	    });
	    public static Message request2Message(HttpServletRequest request) throws Exception{
	    	request.setCharacterEncoding("UTF-8");
			 logger.info("addMessage start...");
			Map<String, String> requestMap = MessageUtil.parseXml(request);
			Message message = new Message();
			// 从HashMap中取出消息中的字段；
			// 发送方帐号（open_id）
			String fromUserName = requestMap.get("FromUserName");
			// 公众帐号
			String toUserName = requestMap.get("ToUserName");
			// 消息类型
			String msgType = requestMap.get("MsgType");
			//创建时间(整型)
			String createTime = requestMap.get("CreateTime");
			//消息ID
			String msgid = "";
			String content ="";
			//文本消息
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)){
				// 	消息id，64位整型 
				msgid = requestMap.get("MsgId");
				// 消息内容
				content = requestMap.get("Content");
			//图片消息
			}if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)){
	             // 消息id，64位整型 
				msgid = requestMap.get("MsgId");
				// 图片链接 +图片消息媒体id，可以调用多媒体文件下载接口拉取数据。
				String picurl =  requestMap.get("PicUrl");
				String mediaid =requestMap.get("MediaId");
				content =picurl+","+mediaid;
			}
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)){
				 // 消息id，64位整型 
				msgid = requestMap.get("MsgId");
				// 语音格式，如amr，speex等 +语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
				String format = requestMap.get("Format");
				String mediaid = requestMap.get("MediaId");
				content =format+","+mediaid;
			}
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)){
				//消息id，64位整型 
				msgid = requestMap.get("MsgId");
				// 地理位置
				String x = requestMap.get("Location_X");
				String y = requestMap.get("Location_Y");
				//地理位置信息
				String label = requestMap.get("Label");
				content = x+","+y+","+label;
			}
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)){
				//消息id，64位整型 
				msgid = requestMap.get("MsgId");
				//消息标题
				String title = requestMap.get("title");
				//url
				String url = requestMap.get("Url");
				content = url+","+title;
			}
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VIDEO)){
				//消息id，64位整型 
				msgid = requestMap.get("MsgId");
				// 视频消息媒体id，可以调用多媒体文件下载接口拉取数据 
				String mediaId = requestMap.get("MediaId");
				//视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。 
				String thumbMediaId = requestMap.get("ThumbMediaId ");
				content = thumbMediaId+","+mediaId;
			}
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_SHORTVIDEO)){
				//消息id，64位整型 
				msgid = requestMap.get("MsgId");
				// 视频消息媒体id，可以调用多媒体文件下载接口拉取数据 
				String mediaId = requestMap.get("MediaId");
				//视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。 
				String thumbMediaId = requestMap.get("ThumbMediaId ");
				content = thumbMediaId+","+mediaId;
			}
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)){
				//事件KEY值
				msgid = requestMap.get("EventKey");
				//事件类型
				content = requestMap.get("Event");
			}
			message.setContent(content);
			message.setCreateTime(createTime);
			message.setFromUserName(fromUserName);
			message.setToUserName(toUserName);
			message.setMsgId(msgid);
			message.setMsgType(msgType);
			logger.info(message.toString());
	    	return message;
	    }
	}
