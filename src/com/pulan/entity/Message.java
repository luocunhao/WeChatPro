package com.pulan.entity;

public class Message {
   private int id;
   //content,mediaid,mediaid,mediaid,mediaid,(location_x,location_y),url,subscribeµÈ
   private String Content;
   private String CreateTime;
   private String ToUserName;
   private String FromUserName;
   //text,image,voice,video,shortvideo,location,link,event
   private String MsgType;
   private String MsgId;
public Message(int id, String content, String createTime, String toUserName, String fromUserName, String msgType,
		String msgId) {
	this.id = id;
	Content = content;
	CreateTime = createTime;
	ToUserName = toUserName;
	FromUserName = fromUserName;
	MsgType = msgType;
	MsgId = msgId;
}
public Message() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getContent() {
	return Content;
}
public void setContent(String content) {
	Content = content;
}
public String getCreateTime() {
	return CreateTime;
}
public void setCreateTime(String createTime) {
	CreateTime = createTime;
}
public String getToUserName() {
	return ToUserName;
}
public void setToUserName(String toUserName) {
	ToUserName = toUserName;
}
public String getFromUserName() {
	return FromUserName;
}
public void setFromUserName(String fromUserName) {
	FromUserName = fromUserName;
}
public String getMsgType() {
	return MsgType;
}
public void setMsgType(String msgType) {
	MsgType = msgType;
}
public String getMsgId() {
	return MsgId;
}
public void setMsgId(String msgId) {
	MsgId = msgId;
}
@Override
public String toString() {
	return "Message [id=" + id + ", Content=" + Content + ", CreateTime=" + CreateTime + ", ToUserName=" + ToUserName
			+ ", FromUserName=" + FromUserName + ", MsgType=" + MsgType + ", MsgId=" + MsgId + "]";
}

}
