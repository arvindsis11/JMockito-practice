package com.arvind.jmockito.apis;

public interface EmailSender {
	
	void sendMail(String to,String sub,String body);

}
