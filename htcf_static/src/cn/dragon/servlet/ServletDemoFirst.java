package cn.dragon.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ServletDemoFirst extends HttpServlet {
	
	//��ʼ��
	public void init() throws ServletException{
		
	}
	
	//���ڴ���ͻ��˷��͵�GET���� 
	public void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		
		System.out.println("doGet��������Get����");
		
		response.setContentType("text/html;charset=GB2312");
		PrintWriter out = response.getWriter();
		out.print("<HTML>");
		out.print("��ã�����Caffcoo");
		out.print("</BODY>");
		out.print("</HTML>");
		
	}
	//���ڴ���ͻ��˷��͵�post����
	public void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		
		doGet(request,response);
		
	}
	
	/*public void destroy() {
		super.destroy();
		System.out.println("*********************");
	}*/
	
	
	
}
