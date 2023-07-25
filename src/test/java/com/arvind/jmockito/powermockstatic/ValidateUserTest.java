package com.arvind.jmockito.powermockstatic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateUserTest {

	@Test
	void testUserdata() {
		ValidateUser user = new ValidateUser();
		assertEquals("arvind", ValidateUser.userData("arvind"));
	}

}
