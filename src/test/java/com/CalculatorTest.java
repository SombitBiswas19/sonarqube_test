package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	 void testadd() {
		Calculator calc=new Calculator();
		int res=calc.add(2, 3);
		assertEquals(5,res);
	}	
}
