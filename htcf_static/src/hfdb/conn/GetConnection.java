package hfdb.conn;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;


/**
 * ������
 * @author Administrator
 *
 */
public class GetConnection {
	private static final String DRIVER="com.mysql.jdbc.Driver"; //��������
	private static final String URL="jdbc:mysql://127.0.0.1:3306/htcf"; //·��
	private static final String USERNAME="root"; //�û�����
	private static final String PASSWORD="61@q$3@%!^XK72"; //�û�����

	private static Connection conn=null; //��������
	
	/**
	 * ������ݿ������ 
	 * @return ����
	 */
	public static Connection getConn(){
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void main(String[] args) {
		GetConnection cc=new GetConnection();
		System.out.println("������ӣ�"+cc.getConn());
	}
}
