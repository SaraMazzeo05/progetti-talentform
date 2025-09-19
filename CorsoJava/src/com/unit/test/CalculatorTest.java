package com.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
		//fail("Not yet implemented");
	}
	
	@Test
	void testSott() {
		Calculator calc = new Calculator();
        assertEquals(3, calc.sott(6, 3));
		//fail("Not yet implemented");
	}
	
	@Test
	void testDiv() {
		Calculator calc = new Calculator();
        assertEquals(2, calc.div(6, 3));
		//fail("Not yet implemented");
	}
	
	@Test
	void testMolt() {
		Calculator calc = new Calculator();
        assertEquals(6, calc.molt(2, 3));
		//fail("Not yet implemented");
	}
	
	@Test
	void testNotNull() {
		String str = "prova";
		assertNotNull(str);
	}
	
	@Test
	void testStringEquals() {
		String expected = "JUnit";
		String actual = "JUnit";
		assertEquals(expected, actual);
	}
	
	@Test
	void testSameObject() {
		String a = "JUnit";
		String b = a;
		assertSame(a, b);
	}
	
	@Test
	void testNotSameObject() {
		String c = new String ("JUnit");
		String d = new String ("JUnit");
		assertNotSame(c, d);
	}
	
	@Test
	void testTrueCondition() {
		assertTrue (5 > 2);
		assertTrue (8 > 5);
	}
	
	@Test
	void testThrowsException() {
		assertThrows(ArithmeticException.class, () -> {int x = 1/0;}); 
	}
	
	@Test
	void testArrayEquals() {
		int[] expected = new int[3];
		int[] actual = new int[3];
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void testStringLength() {
		assertEquals(26,"ABCDEFGHIJKLMNOPQRSTUVWXYZ".length());
	}
	
	
	@Test
	void testDoubleCompare() {
		assertEquals(3.14, 3.1425, 0.01);
	}
	
	@Test
	void testAntiList() {
		List<Integer> lista = new ArrayList<>();
		lista.add(Integer.valueOf(1));
		assertEquals(1, lista.size());
		assertFalse(lista.isEmpty());
	}
	
	@Test
	void testMultipleAssertions() {
		int a = 5;
		int b = 10;
		assertAll(() -> assertTrue (a < b),
				()-> assertEquals(15, a+b));
	}
	
	@Test
	void testUpperCase() {
		assertEquals("BENVENUTO", "BENVENUTO".toUpperCase());
	}
}
