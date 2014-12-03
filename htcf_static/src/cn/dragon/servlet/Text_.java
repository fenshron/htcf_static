package cn.dragon.servlet;

import java.io.UnsupportedEncodingException;

public class Text_ {
	
	/**
	 * 采用ISO8859-1编码方式时，一个中/英文都只占一个字节；采用GB2312或GBK编码方式时，
	 * 一个中文占两个字节；而采用UTF-8编码方式时，一个中文占三个字节
	 * @param args
	 * @throws caffcoo
	 */
	public static void main1(String []args) throws UnsupportedEncodingException  {  
	    // 运行结果：2  
	    System.out.println("乐超".getBytes("ISO8859-1").length);  
	    // 运行结果：4  
	    System.out.println("乐超".getBytes("GB2312").length);  
	    // 运行结果：4  
	    System.out.println("乐超".getBytes("GBK").length);  
	    // 运行结果：6  
	    System.out.println("乐超".getBytes("UTF-8").length);  
	}  
	
	private static String getMsgContent() {  
	    StringBuffer buffer = new StringBuffer();  
	    // 每行70个汉字，共682个汉字加1个英文的感叹号  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵!");  
	    return buffer.toString();  
	}  
	  
	public static void main(String []args) throws Exception  {  
	    // 采用gb2312编码方式时占1365个字节  
	    System.out.println(getMsgContent().getBytes("gb2312").length);  
	    // 采用utf-8编码方式时占2047个字节  
	    System.out.println(getMsgContent().getBytes("utf-8").length);  
	}

}
