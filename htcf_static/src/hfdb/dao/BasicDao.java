package hfdb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import hfdb.conn.GetConnection;

public class BasicDao {
	private PreparedStatement ptsm=null; //Ԥ����
	private ResultSet rs=null; //�����
	private Connection conn=null; //����
	private Statement stm=null; 
	private int ret=0;
	
	/**
	 * �޲ι��췽�����������ݿ������
	 */
	public BasicDao() {
		conn=GetConnection.getConn(); //�������ݿ����ӷ���
	}
	
	/**
	 * ����������ѯ������Ϣ
	 * @param sql sql���
	 * @param value �����ֵ
	 * @return rs�����
	 */
	public ResultSet read(String sql,Object[] values) {
		if(conn!=null){
			try {
				ptsm=conn.prepareStatement(sql);
				for(int i=0;i<values.length;i++) { //����ѭ��
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
	 * ��ѯ���е���Ϣ ���������Ĳ�ѯ
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
	 * ��ɾ��ĵĲ���
	 * @param sql sql���
	 * @param values Ҫ���Ĳ���
	 * @return ���ز�ѯ�Ľ��
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
