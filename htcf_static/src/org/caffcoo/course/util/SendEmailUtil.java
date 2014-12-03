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
			  // ��һ��������javax.mail.Session����
			  System.out.println("Ϊ" + smtpHost + "����mail session����");
			  Properties props = new Properties();
			  props.put("mail.smtp.host", smtpHost);
			  props.put("mail.smtp.starttls.enable","true");//ʹ�� STARTTLS��ȫ����
			  //props.put("mail.smtp.port", "25");    //googleʹ��465��587�˿�
			  props.put("mail.smtp.auth", "true");  // ʹ����֤
			  //props.put("mail.debug", "true");
			  Session mailSession = Session.getInstance(props,new MyAuthenticator(userName,password));
			  // �ڶ�������д��Ϣ
			  System.out.println("��д��Ϣfrom����to:" + userName + "����" + to);
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
			  // ��������������Ϣ
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
