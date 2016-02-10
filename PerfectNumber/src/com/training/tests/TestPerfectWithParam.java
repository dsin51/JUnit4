package com.training.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.training.PerfectNumber;

@RunWith(Parameterized.class)
public class TestPerfectWithParam {

	private int numbers;
	
	PerfectNumber pn = null;
	
	public TestPerfectWithParam(int number) {
		super();
		this.numbers = number;
	}
	
	@Before
	public void setUp() throws Exception {
		pn = new PerfectNumber();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{5},{6},{7}};
		return Arrays.asList(data);
	}
	
	@Test
	public void testPerfectWithParam() {
		PerfectNumber pn = new PerfectNumber();
		boolean actual = pn.isPerfect(numbers);
		assertTrue(numbers+" is not Perfect",actual);
	}
	

}
