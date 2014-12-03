package org.caffcoo.course.util;

import java.util.Calendar;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class SendEmailUtil {
	public  void sendMessage(String smtpHost, String userName,
			   String password, String to, String subject,
			   String messageText, String messageType) throws MessagingException {
			  // 第一步：配置javax.mail.Session对象
			  System.out.println("为" + smtpHost + "配置mail session对象");
			  Properties props = new Properties();
			  props.put("mail.smtp.host", smtpHost);
			  props.put("mail.smtp.starttls.enable","true");//使用 STARTTLS安全连接
			  //props.put("mail.smtp.port", "25");    //google使用465或587端口
			  props.put("mail.smtp.auth", "true");  // 使用验证
			  //props.put("mail.debug", "true");
			  Session mailSession = Session.getInstance(props,new MyAuthenticator(userName,password));
			  // 第二步：编写消息
			  System.out.println("编写消息from——to:" + userName + "——" + to);
			  InternetAddress fromAddress = new InternetAddress(userName);
			  InternetAddress toAddress = new InternetAddress(to);
			  MimeMessage message = new MimeMessage(mailSession);
			  message.setFrom(fromAddress);
			  message.setText(messageText, "gb2312");
			  message.setHeader("Content-Type", "text/plain; charset=gb2312");
			  message.addRecipient(RecipientType.TO, toAddress);
			  message.setSentDate(Calendar.getInstance().getTime());
			  message.setSubject(subject);
			  message.setContent(messageText, messageType);
			  // 第三步：发送消息
			  Transport transport = mailSession.getTransport("smtp");
			  //transport.connect(smtpHost,"1234156789", fromUserPassword);
			  transport.send(message, message.getRecipients(RecipientType.TO));
			  System.out.println("message yes");
			 }
}
class MyAuthenticator extends Authenticator{
	 String userName="";
	 String password="";
	 public MyAuthenticator(){

	 }
	 public MyAuthenticator(String userName,String password){
	 this.userName=userName;
	 this.password=password;
	 }
	 protected PasswordAuthentication getPasswordAuthentication(){ 
	 return new PasswordAuthentication(userName, password); 
	 } 
}
