package org.caffcoo.course.message.resp;

/**
 * 响应文本消息
 * @author caffcoo
 *
 */
public class TextMessage extends BaseMessage {

	// 响应的消息内容
	private String Content;

	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
}
