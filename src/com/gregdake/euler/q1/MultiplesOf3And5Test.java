package com.gregdake.euler.q1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MultiplesOf3And5Test {

	@Test public void
	below10() {
		assertEquals(23, MultiplesOf3And5.compute(10));
	}
	
	@Test public void
	multiplesOf3Or5() {
		List<Integer> expected =Arrays.asList(3,5,6,9);
		assertEquals(expected, MultiplesOf3And5.findMultiplesOf3Or5(10));
	}

	@Test public void
	below1000() {
		assertEquals(233168, MultiplesOf3And5.compute(1000));
	}

}
