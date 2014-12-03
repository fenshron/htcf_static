package hfdb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hfdb.dao.ManageDao;
import hfdb.dao.UserDao;
import hfdb.entity.Manage;
import hfdb.entity.UserInfo;

/**
 * �û�servlet ����ʵ�ֵ�¼����
 * 
 * @date 7-25
 * @version 1.0
 * @author lgs
 * 
 */
public class ManageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ManageServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// ��һ�������ҳ���ֵ
		String manageName = request.getParameter("manageName");
		String managePwd = request.getParameter("managePwd");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Manage manage = null;
		// �ڶ�����ʵ�ַ�����
		ManageDao dao = new ManageDao();
		manage = dao.Login(manageName, managePwd);

		if (manage != null) {
			UserDao userDao = new UserDao();
			List<UserInfo> list = null;
			list = userDao.UserList();
			request.getSession().setAttribute("list", list);
			out.print("<script>");
			out.print("alert(\"��¼�ɹ���\");");
			out.print("window.location.href='userlist.htm'");
			out.print("</script>");
			out.close();
		} else {
			out.print("<script>");
			out.print("alert(\"��¼ʧ�ܣ������µ�¼��\");");
			out.print("window.location.href='index.htm'");
			out.print("</script>");
			out.close();
		}

	}

}
