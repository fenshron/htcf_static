package hfdb.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;

import hfdb.entity.Manage;
import hfdb.entity.UserInfo;

/**
 * 用户的方法类，继承自BasicDao
 * @version 1.0
 * @date 14-5-4
 * @author lgs
 */

public class UserDao extends BasicDao{ //继承BasicDao
	
	private String sql=""; //定义sql的变量
	private Object[] values=null; //定义对象
	private int ret=0;
	private Result result=null;
	private List list=null; //集合
	private UserInfo userinfo;
	
	/**
	 * 用户注册
	 * @param user 用户对象
	 * @return
	 */
	public int RegUser(UserInfo user){
		sql = "INSERT INTO userinfo(userName,userPhone,userEmail) VALUES (?,?,?)";
		values = new Object[] {user.getUserName(),user.getUserPhone(),user.getUserEmail()};
		ret=super.write(sql, values);
		return ret;
	}
	
	
	/**
	 * 查询全部的书籍信息
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
	 * 用于集合查询的调用
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
			list.add(userinfo); //向集合里面添加对象
		}
	}
	
}
