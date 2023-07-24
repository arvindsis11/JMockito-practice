package com.arvind.jmockito.alertservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.arvind.jmockito.apis.EmailSender;

@ExtendWith(MockitoExtension.class)
class EmailNotificationTest {
	
	@Mock
	EmailSender emailapi;
	
	@InjectMocks
	EmailNotification service;

	@Test
	void testSendEmailNotification() {	
		String email = "arvindsis35@gmail.com";
		String message = "Hello, this is a notification!";
		service.sendEmailNotification(email, message);
		ArgumentCaptor<String> emailc = ArgumentCaptor.forClass(String.class);
		ArgumentCaptor<String> subc = ArgumentCaptor.forClass(String.class);
		ArgumentCaptor<String> messagec = ArgumentCaptor.forClass(String.class);
		
		verify(emailapi).sendMail(emailc.capture(), subc.capture(), messagec.capture());
	    assertEquals(email, emailc.getValue());
        assertEquals("notification", subc.getValue());
        assertEquals(message, messagec.getValue());
        System.out.println(emailc.getValue()+" ");
		
		
	}

}
