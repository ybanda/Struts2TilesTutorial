package com.struts2Tiles.tutorial.utils;

import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailUtil {
	public String sendLeaveRequestMail(String from, String to, String cc, String sub, String body){
		try{
			Properties props = new Properties();
			props.put("mail.transport.protocol","smtp");
			props.put("mail.smtp.host","mail.bykrz.com");
			
			Session ses = Session.getDefaultInstance(props);
			
			Message msg = new MimeMessage(ses);
			msg.setSubject(sub);
			msg.setText(body);
			
			Address fromAddr = new InternetAddress(from);
			Address toAddr = new InternetAddress(to);
			Address ccAddr= new InternetAddress(cc);
			
			msg.setFrom(fromAddr);
			msg.setRecipient(Message.RecipientType.TO, toAddr);
			msg.setRecipient(Message.RecipientType.CC, ccAddr);
			msg.setSentDate(new Date());
			Transport.send(msg);
			System.out.println("success");
			return "success";
		}
		catch(Exception e)
		{
			System.out.println("failure"+e);
			return "failure";
		}
	}
	public static void main(String[] args) {
		MailUtil mu = new MailUtil();
		String to="bykr@bykrz.com";
		String from = "bykr@bykrz.com";
		String cc = "bykr@bykrz.com";
		String sub = "interaction";
		String body = "Hai this is bykr@bykrz";
		mu.sendLeaveRequestMail(from, to, cc, sub, body);
	}
}