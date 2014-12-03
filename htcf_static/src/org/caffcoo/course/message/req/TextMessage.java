package org.caffcoo.course.message.req;

/**
 * 請求文本消息
 * @author caffcoo
 *
 */
public class TextMessage extends BaseMessage {

	//消息内容
	private String Content;

	
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
}
