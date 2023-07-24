package com.arvind.jmockito.alertservice;

import com.arvind.jmockito.apis.EmailSender;

public class EmailNotification {
	
	private EmailSender emailSender;

	public EmailNotification(EmailSender emailSender) {
		this.emailSender = emailSender;
	}
	
	public void sendEmailNotification(String email,String message) {
		emailSender.sendMail(email, "notification", message);
	}
	
	
}
