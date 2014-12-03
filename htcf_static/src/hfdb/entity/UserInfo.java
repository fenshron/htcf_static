package hfdb.entity;

public class UserInfo {
	private int userId;
	private String userName;
	private String userPhone;
	private String userEmail;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "UserInfo [userEmail=" + userEmail + ", userId=" + userId
				+ ", userName=" + userName + ", userPhone=" + userPhone + "]";
	}
	public UserInfo(int userId, String userName, String userPhone,
			String userEmail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
	}
	
	public UserInfo(String userName, String userPhone,
			String userEmail) {
		super();
	
		this.userName = userName;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
