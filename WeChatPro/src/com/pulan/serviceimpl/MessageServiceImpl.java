package com.pulan.serviceimpl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulan.controller.MessageController;
import com.pulan.dao.MessageDao;
import com.pulan.entity.Message;
import com.pulan.service.MessageService;
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
	public void addMessage(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		 request.setCharacterEncoding("UTF-8");
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
		logger.info(msgType);
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
		messageDao.addMessage(message);
	}
   
}
