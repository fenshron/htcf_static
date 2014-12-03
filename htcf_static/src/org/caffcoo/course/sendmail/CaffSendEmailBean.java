package org.caffcoo.course.sendmail;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.mail.*;
import org.caffcoo.course.util.SendEmailUtil;
@ViewScoped 
@ManagedBean(name="caffSendEmailBean")
public class CaffSendEmailBean{
	private CaffSendEmail caffsendemail=new CaffSendEmail();
	public String send(){
		 try {
			 //252425502
			SendEmailUtil sendemail=new SendEmailUtil();
			sendemail.sendMessage(
					"smtp.qq.com",
					"502109651@qq.com",
					"loading__==...3",
					"502109651@qq.com",
					"财富中心财富预约",
					caffsendemail.toString(),
					"text/plain;charset=gb2312");
			caffsendemail.setFlag(true);
		}catch (MessagingException e) {
			e.printStackTrace();
		} 
		 return "";
	 }

	public CaffSendEmail getCaffsendemail() {
		return caffsendemail;
	}

	public void setCaffsendemail(CaffSendEmail caffsendemail) {
		this.caffsendemail = caffsendemail;
	}
	
	public static void main(String[] args) {
		
	}

	 

 
	
	 
	
	
	
}
 

