package com.epam.tddjuint;
import static org.junit.Assert.*;
import org.junit.Test;
public class Task8test 
{
	@Test
	public void test() {
		Task8 a=new Task8();
		assertEquals("BCD",a.remove("ABCD"));
		assertEquals("CD",a.remove("AACD"));
		assertEquals("BCD",a.remove("BACD"));
		assertEquals("BBAA",a.remove("BBAA"));
		assertEquals("BAA",a.remove("AABAA"));
	}
}
