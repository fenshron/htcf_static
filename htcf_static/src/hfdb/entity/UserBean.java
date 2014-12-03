package hfdb.entity;

import hfdb.dao.UserDao;

import java.util.List;



public class UserBean {

	private List<UserInfo> userList = null; //定义空集合 


	/**
	 * 全部商品
	 * @return
	 */
	public List<UserInfo> getList() {
		System.out.println("sssssssssssssssssss");
		UserDao dao = new UserDao();
		return userList = dao.UserList();
	}
	
	public static void main(String[] args) {
		UserBean b=new UserBean();
	    List ll=b.getList();
	    System.out.println(ll.size());
	}
}
