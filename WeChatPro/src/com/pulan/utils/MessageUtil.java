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
     * ������Ϣ���ͣ��ı� 
     */  
    public static final String RESP_MESSAGE_TYPE_TEXT = "text";  
  
    /** 
     * ������Ϣ���ͣ����� 
     */   
    public static final String RESP_MESSAGE_TYPE_MUSIC = "music";  
  
    /** 
     * ������Ϣ���ͣ�ͼ�� 
     */  
    public static final String RESP_MESSAGE_TYPE_NEWS = "news";  
  

    /** 
     * ������Ϣ���ͣ��ı� 
     */  
    public static final String REQ_MESSAGE_TYPE_TEXT = "text";  
  
    /** 
     * ������Ϣ���ͣ�ͼƬ 
     */  
    public static final String REQ_MESSAGE_TYPE_IMAGE = "image";  
    /** 
     * ������Ϣ���ͣ����� 
     */  
    public static final String REQ_MESSAGE_TYPE_LINK = "link";  
  

    /** 
     * ������Ϣ���ͣ�����λ�� 
     */  
    public static final String REQ_MESSAGE_TYPE_LOCATION = "location";  
    /** 
     * ������Ϣ���ͣ���Ƶ 
     */  
    public static final String REQ_MESSAGE_TYPE_VOICE = "voice";  
    /** 
     * ������Ϣ���ͣ���Ƶ 
     */  
    public static final String REQ_MESSAGE_TYPE_VIDEO = "video";  
    /** 
     * ������Ϣ���ͣ�С��Ƶ 
     */  
    public static final String REQ_MESSAGE_TYPE_SHORTVIDEO = "shortvideo";  
  
    /** 
     * ������Ϣ���ͣ����� 
     */  
    public static final String REQ_MESSAGE_TYPE_EVENT = "event";  
  

    /** 
     * �¼����ͣ�subscribe(����) 
     */  
    public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";  
  
    /** 
     * �¼����ͣ�unsubscribe(ȡ������) 
     */  
    public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";  
  
    /** 
     * �¼����ͣ�CLICK(�Զ���˵�����¼�) 
     */  
    public static final String EVENT_TYPE_CLICK = "CLICK";  
  
	private static Logger logger = Logger.getLogger(MessageUtil.class);
	 /** 
     * ����΢�ŷ���������XML�� 
     *  
     * @param request 
     * @return 
     * @throws Exception 
     */  
	 public static Map<String, String> parseXml(HttpServletRequest request) throws Exception {  
		// ����������洢��HashMap��  
	        Map<String, String> map = new HashMap<String, String>();  
	  
	        // ��request��ȡ�������� 
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
	     * �ı���Ϣ����ת����xml 
	     *  
	     * @param textMessage �ı���Ϣ���� 
	     * @return xml 
	     */  
	    public static String textMessageToXml(TextMessage textMessage) {  
	        xstream.alias("xml", textMessage.getClass());  
	        return xstream.toXML(textMessage);  
	    }  
	  
	    /** 
	     * ������Ϣ����ת����xml 
	     *  
	     * @param musicMessage ������Ϣ���� 
	     * @return xml 
	     */  
	   /* public static String musicMessageToXml(MusicMessage musicMessage) {  
	        xstream.alias("xml", musicMessage.getClass());  
	        return xstream.toXML(musicMessage);  
	    }  */
	  
	    /** 
	     * ͼ����Ϣ����ת����xml 
	     *  
	     * @param newsMessage ͼ����Ϣ���� 
	     * @return xml 
	     */  
	    public static String newsMessageToXml(NewsMessage newsMessage) {  
	        xstream.alias("xml", newsMessage.getClass());  
	        xstream.alias("item", new Article().getClass());  
	        return xstream.toXML(newsMessage);  
	    }  

	    /** 
	     * ��չxstream��ʹ��֧��CDATA�� 
	     *  
	     */   
	    private static XStream xstream = new XStream(new XppDriver() {  
	        public HierarchicalStreamWriter createWriter(Writer out) {  
	            return new PrettyPrintWriter(out) {  
	            	  // ������xml�ڵ��ת��������CDATA���   
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
			// ��HashMap��ȡ����Ϣ�е��ֶΣ�
			// ���ͷ��ʺţ�open_id��
			String fromUserName = requestMap.get("FromUserName");
			// �����ʺ�
			String toUserName = requestMap.get("ToUserName");
			// ��Ϣ����
			String msgType = requestMap.get("MsgType");
			//����ʱ��(����)
			String createTime = requestMap.get("CreateTime");
			//��ϢID
			String msgid = "";
			String content ="";
			//�ı���Ϣ
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)){
				// 	��Ϣid��64λ���� 
				msgid = requestMap.get("MsgId");
				// ��Ϣ����
				content = requestMap.get("Content");
			//ͼƬ��Ϣ
			}if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)){
	             // ��Ϣid��64λ���� 
				msgid = requestMap.get("MsgId");
				// ͼƬ���� +ͼƬ��Ϣý��id�����Ե��ö�ý���ļ����ؽӿ���ȡ���ݡ�
				String picurl =  requestMap.get("PicUrl");
				String mediaid =requestMap.get("MediaId");
				content =picurl+","+mediaid;
			}
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)){
				 // ��Ϣid��64λ���� 
				msgid = requestMap.get("MsgId");
				// ������ʽ����amr��speex�� +������Ϣý��id�����Ե��ö�ý���ļ����ؽӿ���ȡ���ݡ�
				String format = requestMap.get("Format");
				String mediaid = requestMap.get("MediaId");
				content =format+","+mediaid;
			}
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)){
				//��Ϣid��64λ���� 
				msgid = requestMap.get("MsgId");
				// ����λ��
				String x = requestMap.get("Location_X");
				String y = requestMap.get("Location_Y");
				//����λ����Ϣ
				String label = requestMap.get("Label");
				content = x+","+y+","+label;
			}
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)){
				//��Ϣid��64λ���� 
				msgid = requestMap.get("MsgId");
				//��Ϣ����
				String title = requestMap.get("title");
				//url
				String url = requestMap.get("Url");
				content = url+","+title;
			}
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VIDEO)){
				//��Ϣid��64λ���� 
				msgid = requestMap.get("MsgId");
				// ��Ƶ��Ϣý��id�����Ե��ö�ý���ļ����ؽӿ���ȡ���� 
				String mediaId = requestMap.get("MediaId");
				//��Ƶ��Ϣ����ͼ��ý��id�����Ե��ö�ý���ļ����ؽӿ���ȡ���ݡ� 
				String thumbMediaId = requestMap.get("ThumbMediaId ");
				content = thumbMediaId+","+mediaId;
			}
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_SHORTVIDEO)){
				//��Ϣid��64λ���� 
				msgid = requestMap.get("MsgId");
				// ��Ƶ��Ϣý��id�����Ե��ö�ý���ļ����ؽӿ���ȡ���� 
				String mediaId = requestMap.get("MediaId");
				//��Ƶ��Ϣ����ͼ��ý��id�����Ե��ö�ý���ļ����ؽӿ���ȡ���ݡ� 
				String thumbMediaId = requestMap.get("ThumbMediaId ");
				content = thumbMediaId+","+mediaId;
			}
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)){
				//�¼�KEYֵ
				msgid = requestMap.get("EventKey");
				//�¼�����
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
