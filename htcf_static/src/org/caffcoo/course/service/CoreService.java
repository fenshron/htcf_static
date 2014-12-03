package org.caffcoo.course.service;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.caffcoo.course.message.resp.TextMessage;
import org.caffcoo.course.util.MessageUtil;


/**
 * 核心服务类
 * @author caffcoo
 *
 */
public class CoreService {

	/** 
     * 处理微信发来的请求 
     *  
     * @param request 
     * @return 
     */  
	public static String processRequest(HttpServletRequest request) {
		String respMessage = null;  
		try {
			//默认返回的文本消息内容
			String respContent = "请求有问题，请再一次尝试，谢谢！";
			/**
			 * xml请求解析
			 * 调用消息工具类MessageUtil解析微信发来的xml格式的消息，解析的结果放在HashMap里
			 */
			Map<String, String> requestMap = MessageUtil.parseXml(request);
			//发送方账户(open_id)
			String fromUserName = requestMap.get("FromUserName");
			//公众账号
			String toUserName = requestMap.get("ToUserName");
			//消息类型
			String msgType = requestMap.get("MsgType");
			//回复文本消息
			TextMessage textMessage = new TextMessage();
			textMessage.setToUserName(fromUserName);
			textMessage.setFromUserName(toUserName);
			textMessage.setCreateTime(new Date().getTime());
			textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
			textMessage.setFuncFlag(0);
			
			//文本消息
			if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)){
				respContent = "你好，你发的是文本消息！";
				textMessage.setContent("[难过] /难过 /::(");
			//图片消息
			}else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)){
				respContent = "你好，你发的是图片消息！";
			}
			//地理位置消息
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)){
				respContent = "你好，你发的是地理位置消息！";
			}
			//链接消息
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)){
				respContent = "你好，你发的是链接消息！";
			}
			//音频消息
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)){
				respContent = "你好，你发的是音频消息！";
			}
			//事件推送
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)){
				//事件类型
				String eventType = requestMap.get("Event");
				//订阅
				if(eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)){
					respContent = "谢谢你关注Caffcoo!";
				}
				//取消订阅
				else if(eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)){
					//取消收不到公号发出的消息，不回复
				}
				//自定义菜单点击事件
				else if(eventType.equals(MessageUtil.EVENT_TYPE_CLICK)){
					//没有自定义菜单权限
				}
			}
			textMessage.setContent(respContent);
			//返回的文本消息对象TextMessage转化成xml格式的字符串
			respMessage = MessageUtil.textMessageToXml(textMessage);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respMessage;
	}

}
