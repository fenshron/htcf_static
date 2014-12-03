package org.caffcoo.course.message.req;

/**
 * 請求消息基类(用户 到  公众账号)
 * @author caffcoo
 */
public class BaseMessage {
	
	//开发者微信号
	private String ToUserName;
	//发送发账号（OpenID）
	private String FromUserName;
	//消息创建时间（整型）
	private long CreateTime;
	//消息类型（分为文本、图片...）
	private String MsgType;
	//消息ID ,64位、整形
	private long MsgId;
	
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
	
	public long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}
	
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	
	public long getMsgId() {
		return MsgId;
	}
	public void setMsgId(long msgId) {
		MsgId = msgId;
	}
}
