package org.caffcoo.course.message.req;

/**
 * 請求图片消息
 * @author caffcoo
 */
public class ImageMessage extends BaseMessage {

	// 图片链接
	private String PicUrl;
	 
	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
}
