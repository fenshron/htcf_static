package hfdb.dao;

import java.sql.ResultSet;

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

public class ManageDao extends BasicDao{ //�̳�BasicDao
	
	private ResultSet rs=null; //�����
	private Result result=null;
	private String sql=""; //����sql�ı���
	private Object[] values=null; //�������
	private Manage manage=null;
	
	public Manage Login(String Name, String passWord) {

		sql = "SELECT * FROM manage WHERE manageName=? AND managePwd=?"; // sql���
		values = new Object[] { Name, passWord };
		ResultSet rs = read(sql, values);
		result = ResultSupport.toResult(rs);
		resultToManageBean(result);
		return manage;
	}
	
	private void resultToManageBean(Result result) {
		if (result.getRowCount() > 0) {
			manage = new Manage(Integer.parseInt(result.getRows()[0].get(
					"manageId").toString()), result.getRows()[0].get("manageName")
					.toString(), result.getRows()[0].get("managePwd").toString());

		}
	}
}
