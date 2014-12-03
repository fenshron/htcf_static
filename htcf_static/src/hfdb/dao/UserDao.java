package hfdb.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;

import hfdb.entity.Manage;
import hfdb.entity.UserInfo;

/**
 * �û��ķ����࣬�̳���BasicDao
 * @version 1.0
 * @date 14-5-4
 * @author lgs
 */

public class UserDao extends BasicDao{ //�̳�BasicDao
	
	private String sql=""; //����sql�ı���
	private Object[] values=null; //�������
	private int ret=0;
	private Result result=null;
	private List list=null; //����
	private UserInfo userinfo;
	
	/**
	 * �û�ע��
	 * @param user �û�����
	 * @return
	 */
	public int RegUser(UserInfo user){
		sql = "INSERT INTO userinfo(userName,userPhone,userEmail) VALUES (?,?,?)";
		values = new Object[] {user.getUserName(),user.getUserPhone(),user.getUserEmail()};
		ret=super.write(sql, values);
		return ret;
	}
	
	
	/**
	 * ��ѯȫ�����鼮��Ϣ
	 * @return
	 */
	public List UserList() {
		sql = "SELECT * FROM userinfo ORDER BY userId DESC"; //
		ResultSet rs = read(sql);
		result = ResultSupport.toResult(rs);
		resultToList(result);
		return list;
	}
	
	
	/*
	 * ���ڼ��ϲ�ѯ�ĵ���
	 * resultToList
	 */
	private void resultToList(Result result) {
		list = new ArrayList();
		for (int i = 0; i < result.getRowCount(); i++) {
			userinfo = new UserInfo(Integer.parseInt(result.getRows()[i].get("userId").toString()),
		              result.getRows()[i].get("userName").toString(),
		              result.getRows()[i].get("userPhone").toString(),
		              result.getRows()[i].get("userEmail").toString()
		            );
			list.add(userinfo); //�򼯺�������Ӷ���
		}
	}
	
}
