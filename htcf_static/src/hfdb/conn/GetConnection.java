package hfdb.conn;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;


/**
 * 连接类
 * @author Administrator
 *
 */
public class GetConnection {
	private static final String DRIVER="com.mysql.jdbc.Driver"; //加载驱动
	private static final String URL="jdbc:mysql://127.0.0.1:3306/htcf"; //路径
	private static final String USERNAME="root"; //用户名称
	private static final String PASSWORD="61@q$3@%!^XK72"; //用户密码

	private static Connection conn=null; //定义连接
	
	/**
	 * 获得数据库的连接 
	 * @return 连接
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
		System.out.println("获得连接："+cc.getConn());
	}
}
