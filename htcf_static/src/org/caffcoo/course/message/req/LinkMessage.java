package org.caffcoo.course.message.req;

/**
 * 請求链接消息
 * @author caffcoo
 *
 */
public class LinkMessage extends BaseMessage {
	
	// 消息标题 
	private String Title; 
	// 消息描述 
	private String Description; 
	// 消息链接
	private String Url;
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}

}
