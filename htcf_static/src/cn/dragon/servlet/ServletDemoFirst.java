package cn.dragon.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ServletDemoFirst extends HttpServlet {
	
	//初始化
	public void init() throws ServletException{
		
	}
	
	//用于处理客户端发送的GET请求 
	public void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		
		System.out.println("doGet方法处理Get请求！");
		
		response.setContentType("text/html;charset=GB2312");
		PrintWriter out = response.getWriter();
		out.print("<HTML>");
		out.print("你好，我是Caffcoo");
		out.print("</BODY>");
		out.print("</HTML>");
		
	}
	//用于处理客户端发送的post请求
	public void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		
		doGet(request,response);
		
	}
	
	/*public void destroy() {
		super.destroy();
		System.out.println("*********************");
	}*/
	
	
	
}
