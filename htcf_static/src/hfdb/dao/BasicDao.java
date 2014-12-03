package hfdb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import hfdb.conn.GetConnection;

public class BasicDao {
	private PreparedStatement ptsm=null; //预编译
	private ResultSet rs=null; //结果集
	private Connection conn=null; //连接
	private Statement stm=null; 
	private int ret=0;
	
	/**
	 * 无参构造方法，进行数据库的连接
	 */
	public BasicDao() {
		conn=GetConnection.getConn(); //调用数据库连接方法
	}
	
	/**
	 * 根据条件查询部分信息
	 * @param sql sql语句
	 * @param value 对象的值
	 * @return rs结果集
	 */
	public ResultSet read(String sql,Object[] values) {
		if(conn!=null){
			try {
				ptsm=conn.prepareStatement(sql);
				for(int i=0;i<values.length;i++) { //进行循环
					ptsm.setObject(i+1, values[i]);
				}
				rs=ptsm.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rs;
	}
	
	
	/**
	 * 查询所有的信息 不带条件的查询
	 * @param sql
	 * @return
	 */
	public ResultSet read(String sql){
		if(conn!=null){
			try {
				stm=conn.createStatement();
				rs=stm.executeQuery(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return rs;
		
	}
	
	/**
	 * 增删查改的操作
	 * @param sql sql语句
	 * @param values 要传的参数
	 * @return 返回查询的结果
	 */
	public int write(String sql,Object[] values){
		if(conn!=null){
			try {
				ptsm=conn.prepareStatement(sql);
				for(int i=0;i<values.length;i++){
					ptsm.setObject(i+1, values[i]);
					System.out.print(values[i]);
				}
				ret=ptsm.executeUpdate();
				System.out.print(ret);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ret;
	}
}
