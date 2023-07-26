package com.arvind.jmockito.powermockstatic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
//
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(UserManagement.class)
public class UserManagementTest {

	@Test
	@Disabled
	public void testMultiply() throws Exception  {
		// Mocking the private method 'add' using PowerMockito
		UserManagement userManagementSpy = PowerMockito.spy(new UserManagement());

		PowerMockito.doReturn(5).when(userManagementSpy, "add", 2, 3);

		int result = userManagementSpy.multiply(2, 3);
		assertEquals(30, result);
	}

	@Test
	@Disabled
	public void testSquare() {
		// Mocking the static method 'square' using PowerMockito
		PowerMockito.mockStatic(UserManagement.class);
		when(UserManagement.square(5)).thenReturn(25);

		int result = UserManagement.square(5);
		assertEquals(25, result);
	}
	@Test
	public void testDbConnect() throws Exception  {
		UserManagement obj = new UserManagement();
	obj.dbconnect("arvind");
	}
	
	@Test
	public void testDbConnectV2() throws Exception  {
	
	}
}
