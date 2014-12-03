package org.caffcoo.course.sendmail;

 
public class CaffSendEmail{
	private String caffSendEmailUsername;
	private String caffSendEmailPhone;
	private String caffSendEmailCity;
	private String caffSendEmailWorkAdress;
	private String caffSendEmailJob;
	private String caffSendEmailEmail;
	private String caffSendEmailMoney;
	private String caffSendEmailInformation;
	private boolean flag;
	
	
	public String getCaffSendEmailUsername() {
		return caffSendEmailUsername;
	}



	public void setCaffSendEmailUsername(String caffSendEmailUsername) {
		this.caffSendEmailUsername = caffSendEmailUsername;
	}



	public String getCaffSendEmailPhone() {
		return caffSendEmailPhone;
	}



	public void setCaffSendEmailPhone(String caffSendEmailPhone) {
		this.caffSendEmailPhone = caffSendEmailPhone;
	}



	public String getCaffSendEmailCity() {
		return caffSendEmailCity;
	}



	public void setCaffSendEmailCity(String caffSendEmailCity) {
		this.caffSendEmailCity = caffSendEmailCity;
	}



	public String getCaffSendEmailWorkAdress() {
		return caffSendEmailWorkAdress;
	}



	public void setCaffSendEmailWorkAdress(String caffSendEmailWorkAdress) {
		this.caffSendEmailWorkAdress = caffSendEmailWorkAdress;
	}



	public String getCaffSendEmailJob() {
		return caffSendEmailJob;
	}



	public void setCaffSendEmailJob(String caffSendEmailJob) {
		this.caffSendEmailJob = caffSendEmailJob;
	}



	public String getCaffSendEmailEmail() {
		return caffSendEmailEmail;
	}



	public void setCaffSendEmailEmail(String caffSendEmailEmail) {
		this.caffSendEmailEmail = caffSendEmailEmail;
	}



	public String getCaffSendEmailMoney() {
		return caffSendEmailMoney;
	}



	public void setCaffSendEmailMoney(String caffSendEmailMoney) {
		this.caffSendEmailMoney = caffSendEmailMoney;
	}



	public String getCaffSendEmailInformation() {
		return caffSendEmailInformation;
	}



	public void setCaffSendEmailInformation(String caffSendEmailInformation) {
		this.caffSendEmailInformation = caffSendEmailInformation;
	}

	


	public boolean isFlag() {
		return flag;
	}



	public void setFlag(boolean flag) {
		this.flag = flag;
	}



	@Override
	public String toString() {
		return "姓名:" + caffSendEmailUsername
		+ ",\r\n城市:" + caffSendEmailCity
		+ ",\r\n 了解渠道:" + caffSendEmailInformation
		+ ",\r\n 职务:" + caffSendEmailJob
		+ ",\r\n 预投资金:" + caffSendEmailMoney
		+ ",\r\n 电话:" + caffSendEmailPhone
		+ ",\r\n 邮箱:" + caffSendEmailEmail 
		+ ",\r\n 工作地址:" + caffSendEmailWorkAdress;
	}


	 
	

}
