package com.arvind.jmockito.mockitospy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestListSpy {

	@Test
	void testListSpy() {//override certain functionality
		ArrayList list = spy(ArrayList.class);
		list.add("hello");
		assertEquals(1, list.size());
		when(list.size()).thenReturn(0);
		assertEquals(0,list.size());
		list.add("hello1");
		assertEquals(0, list.size());
		verify(list,times(1)).add("hello1");
		verify(list,never()).remove(0);
		verify(list,times(3)).size();
		
	}
	
	@Test
	void testExperiment() {
		List listMock = mock(List.class);
		when(listMock.add(anyString())).thenReturn(false);
		when(listMock.get(anyInt())).thenReturn("arvind").thenReturn("hello");
		assertFalse(listMock.add("hello"));
		assertEquals(listMock.get(100), "arvind");
		assertEquals(listMock.get(0), "hello");
	}
	@Test
	void testExperiment2() {
		List listMock = mock(List.class);
		assertEquals(0, listMock.size());
		when(listMock.add(anyString())).thenReturn(false);
		when(listMock.get(anyInt())).thenReturn("arvind").thenReturn("hello");
		when(listMock.size()).thenReturn(5);
		assertFalse(listMock.add("hello"));
		assertEquals(listMock.get(100), "arvind");
		assertEquals(listMock.get(0), "hello");
	}

}
