package com.gregdake.euler.q2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class EvenFibonacciNumbersTest {

	@Test public void
	findFirstTenTerms() {
		List<Integer> expected = Arrays.asList(1,2,3,5,8,13,21,34,55,89);
		assertEquals(expected, EvenFibonacciNumbers.calculateFibonacciSeriesFor(89));
	}
	
	@Test public void
	findEvenTerms() {
		List<Integer> expected = Arrays.asList(2,8,34);
		assertEquals(expected, EvenFibonacciNumbers.findEvenTerms(Arrays.asList(1,2,3,5,8,13,21,34,55,89)));
	}
	
	@Test public void
	computeForFirst10Terms() {
		assertEquals(Long.valueOf(44), EvenFibonacciNumbers.compute(89));
	}
	
	@Test public void
	computeForLessThan4Million() {
		assertEquals(Long.valueOf(4613732), EvenFibonacciNumbers.compute(4000000));
	}
	
}
