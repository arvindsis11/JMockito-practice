package com.arvind.jmockito.argumentcaptor;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.arvind.jmockito.apis.EmailSender;
import com.arvind.jmockito.service.RewardService;

@ExtendWith(MockitoExtension.class)
class TestArgumentCaptor {
	
	@Captor
	ArgumentCaptor<String> email;
	@Captor
	ArgumentCaptor<String> toEmail;
	@Captor
	ArgumentCaptor<String> body;
	
	@Test
	void testSendArgumentCaptorMail() {
//		ArgumentCaptor<String> email = ArgumentCaptor.forClass(String.class);
//		ArgumentCaptor<String> toEmail = ArgumentCaptor.forClass(String.class);
//		ArgumentCaptor<String> body = ArgumentCaptor.forClass(String.class);
		RewardService rs = new RewardService();
		EmailSender mockapi = Mockito.mock(EmailSender.class);
		rs.sendArgumentCaptorMail("arvindsis@", "john@", "hello",mockapi);
		verify(mockapi).sendMail(email.capture(), toEmail.capture(), body.capture());
		assertEquals(email.getValue(), "arvindsis@");
		assertThat(rs).hasSameHashCodeAs(rs);
	}
	
	@Test
	void testArrayList() {
		List<Integer> list = Arrays.asList(100,232,33,123,654);
		assertThat(list.size()).isEqualTo(5);
		assertThat(list).contains(100,232,33);
		assertEquals(list,Arrays.asList(100,232,33,123,654) );
		assertThat(list).isSubsetOf(100,232,33,12,654,123);
	}

}
