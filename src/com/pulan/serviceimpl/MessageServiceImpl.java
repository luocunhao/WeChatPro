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
		logger.info(msgType);
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
		messageDao.addMessage(message);
	}
   
}
