package com.gregdake.euler.q3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LargestPrimeFactorTest {

	@Test public void
	findPrimeFactorsOf2() {
		Set<Long> expected = new HashSet<Long>();
		expected.add(2L);
		assertEquals(expected, LargestPrimeFactor.findPrimeFactors(2));
	}
	
	@Test public void
	findPrimeFactorsOf3() {
		Set<Long> expected = new HashSet<Long>();
		expected.add(3L);
		assertEquals(expected, LargestPrimeFactor.findPrimeFactors(3));
	}
	
	@Test public void
	findPrimeFactorsOf6() {
		Set<Long> expected = new HashSet<Long>();
		expected.add(2L);
		expected.add(3L);
		assertEquals(expected, LargestPrimeFactor.findPrimeFactors(6));
	}
	
	@Test public void
	findPrimeFactorsOf9() {
		Set<Long> expected = new HashSet<Long>();
		expected.add(3L);
		assertEquals(expected, LargestPrimeFactor.findPrimeFactors(9));
	}
	
	@Test public void
	findPrimeFactorsOf12() {
		Set<Long> expected = new HashSet<Long>();		
		expected.add(2L);
		expected.add(3L);
		assertEquals(expected, LargestPrimeFactor.findPrimeFactors(12));
	}
	
	@Test public void
	findPrimeFactorsOf13195() {
		Set<Long> expected = new HashSet<Long>();		
		expected.add(5L);
		expected.add(7L);
		expected.add(13L);
		expected.add(29L);
		assertEquals(expected, LargestPrimeFactor.findPrimeFactors(13195));
	}
	
	@Test public void
	twoisPrime() {
		assertTrue(LargestPrimeFactor.isPrime(2L));
	}
	
	@Test public void
	threeisPrime() {
		assertTrue(LargestPrimeFactor.isPrime(3L));
	}
	
	@Test public void
	fourIsNotPrime() {
		assertFalse(LargestPrimeFactor.isPrime(4L));
	}
	
	@Test public void
	fiveIsPrime() {
		assertTrue(LargestPrimeFactor.isPrime(5L));
	}
	
	@Test public void
	nineIsNotPrime() {
		assertFalse(LargestPrimeFactor.isPrime(9L));
	}
	
	@Test public void 
	largestPrimeFactorOf13195Is29() {
		assertEquals(Long.valueOf(29), LargestPrimeFactor.compute(13195));
	}
	
	@Test public void 
	largestPrimeFactorOf_600851475143() {
		assertEquals(Long.valueOf(6857), LargestPrimeFactor.compute(600851475143L));
	}

}
