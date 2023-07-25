package com.arvind.jmockito.listmock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.List;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListMock {
	
	@Mock
	List list;

	@Test
	void testList() {
		when(list.size()).thenReturn(2);
//		List<Integer> asList = Arrays.asList(1,2,3);
		assertEquals(2, list.size());
	}
	
	@Test
	void testListMultipleReturnValues(){
		when(list.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, list.size());
		assertEquals(20, list.size());
	}
	
	@Test
	void testGetListContent() {
		when(list.get(anyInt())).thenReturn("arvind").thenReturn("sisodiya");
		assertEquals("arvind", list.get(0));
		assertEquals("sisodiya", list.get(50));
//		sassertEquals("test", list.get(60));
	}

}
