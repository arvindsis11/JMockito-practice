package com.arvind.jmockito.powermockstatic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Rule;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UserManagement.class)
class UserManagementTest {
	
//	@Rule
//	public MockitoRule mockitoRule = MockitoJUnit.rule();

	@Test
	@Disabled
	void testGetStatus() {
//		UserManagement obj = mock(UserManagement.class);
//		
//		mock.getStatus("arvind");
		UserManagement obj = new UserManagement();
//		when(obj.getStatus("arvind")).thenReturn("arvind");
//		assertEquals("arvind",obj.getStatus("arvind"));
		assertEquals("arvind bye arvind",obj.getStatus("arvind"));
	}
	
	//try to create the mock for private method
	@Test
	@Disabled
	void testMultiplyWithPrivateMockedMethod() throws Exception {
//		UserManagement obj = PowerMockito.spy(new UserManagement());
		PowerMockito.mockStatic(UserManagement.class);
//		PowerMockito.doReturn(10).when(obj,"multiply",2,3);
//		int result = obj.multiply(2, 2);
//		assertEquals(40,result);
		
	}
	
	@Test
	void testGetStatusPrivateSayByeMethod() throws Exception {
		UserManagement obj = new UserManagement();
//		UserManagement mock = PowerMockito.spy(new UserManagement());
//		PowerMockito.when(mock,"SayBye","arvind").thenReturn("testname");
//		assertEquals("testname", obj.getStatus("arvind"));
		Whitebox.invokeMethod(obj, "SayBye");
		
	}
	  @Test
	    public void testSquareWithMockedStaticMethod() {
	        // Mocking the static method 'square'
	        PowerMockito.mockStatic(UserManagement.class);
//	        when(UserManagement.square(5)).thenReturn(25);
//	        int result = UserManagement.square(5);
//	        assertEquals(25, result);
	    }

}
