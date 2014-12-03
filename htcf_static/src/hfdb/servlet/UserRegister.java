package hfdb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hfdb.dao.UserDao;
import hfdb.entity.UserInfo;

/**
 * �û�ע��servlet
 * @date 5-8
 * @version 1.0
 * @author lgs
 *
 */
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegister() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		int ret=0;
		PrintWriter out = response.getWriter();
		//��ȡҳ���ֵ
		String userName = request.getParameter("userName");
		String userPhone = request.getParameter("userPhone");
		String userEmail = request.getParameter("userEmail");
		if(userName==null||userPhone==null||userEmail==null){
			out.println("<script>alert(\"����Ϊ�գ�\"); </script>"); 
		}else{
			UserDao dao=new UserDao();
			UserInfo user = new UserInfo(userName,userPhone,userEmail);
			ret =dao.RegUser(user);
			if(ret!=0){ 
				out.print("<script>");
				out.print("alert(\"��Ϣ���ύ��1-3���������ڻ��й�����Ա��ϵ\");");
				out.print("window.location.href='index.htm'");
				out.print("</script>");
				out.close();
			} else {
				out.print("<script>");
				out.print("alert(\"��������д��Ϣ��\");");
				out.print("</script>");
				out.close();
			}
		}
	
	}
	
	

}
