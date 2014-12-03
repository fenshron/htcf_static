package org.caffcoo.course.service;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.caffcoo.course.message.resp.TextMessage;
import org.caffcoo.course.util.MessageUtil;


/**
 * ���ķ�����
 * @author caffcoo
 *
 */
public class CoreService {

	/** 
     * ����΢�ŷ��������� 
     *  
     * @param request 
     * @return 
     */  
	public static String processRequest(HttpServletRequest request) {
		String respMessage = null;  
		try {
			//Ĭ�Ϸ��ص��ı���Ϣ����
			String respContent = "���������⣬����һ�γ��ԣ�лл��";
			/**
			 * xml�������
			 * ������Ϣ������MessageUtil����΢�ŷ�����xml��ʽ����Ϣ�������Ľ������HashMap��
			 */
			Map<String, String> requestMap = MessageUtil.parseXml(request);
			//���ͷ��˻�(open_id)
			String fromUserName = requestMap.get("FromUserName");
			//�����˺�
			String toUserName = requestMap.get("ToUserName");
			//��Ϣ����
			String msgType = requestMap.get("MsgType");
			//�ظ��ı���Ϣ
			TextMessage textMessage = new TextMessage();
			textMessage.setToUserName(fromUserName);
			textMessage.setFromUserName(toUserName);
			textMessage.setCreateTime(new Date().getTime());
			textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
			textMessage.setFuncFlag(0);
			
			//�ı���Ϣ
			if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)){
				respContent = "��ã��㷢�����ı���Ϣ��";
				textMessage.setContent("[�ѹ�] /�ѹ� /::(");
			//ͼƬ��Ϣ
			}else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)){
				respContent = "��ã��㷢����ͼƬ��Ϣ��";
			}
			//����λ����Ϣ
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)){
				respContent = "��ã��㷢���ǵ���λ����Ϣ��";
			}
			//������Ϣ
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)){
				respContent = "��ã��㷢����������Ϣ��";
			}
			//��Ƶ��Ϣ
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)){
				respContent = "��ã��㷢������Ƶ��Ϣ��";
			}
			//�¼�����
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)){
				//�¼�����
				String eventType = requestMap.get("Event");
				//����
				if(eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)){
					respContent = "лл���עCaffcoo!";
				}
				//ȡ������
				else if(eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)){
					//ȡ���ղ������ŷ�������Ϣ�����ظ�
				}
				//�Զ���˵�����¼�
				else if(eventType.equals(MessageUtil.EVENT_TYPE_CLICK)){
					//û���Զ���˵�Ȩ��
				}
			}
			textMessage.setContent(respContent);
			//���ص��ı���Ϣ����TextMessageת����xml��ʽ���ַ���
			respMessage = MessageUtil.textMessageToXml(textMessage);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respMessage;
	}

}
