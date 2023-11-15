package com.app.assignment.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.modules.junit4.PowerMockRunner;

import com.app.assignmnet.FactorialNo3;
public class FactorialNo3Test {

	@Test
	public void isFactorial(){
		int n=5;
		int result=FactorialNo3.factorial(n);
		assertEquals(120,result);
	}
}
