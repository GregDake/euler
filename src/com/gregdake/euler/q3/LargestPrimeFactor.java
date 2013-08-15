package com.gregdake.euler.q3;

import java.util.TreeSet;

public class LargestPrimeFactor {
	
	public static Long compute(long value) {
		TreeSet<Long> factors = findPrimeFactors(value);
		System.out.println("All factors: " + factors);
		Long largestPrimeFactor = findLargestFactor(factors);
		System.out.println("Largest factor is: " + largestPrimeFactor);

		return largestPrimeFactor;
	}
	
	static TreeSet<Long> findPrimeFactors(long value) {
		TreeSet<Long> factors = new TreeSet<>();
		for(long i = 2; i <= value; i++) {
			if(isPrime(i)) {
				if(evenlyDivisible(value, i)) {
					factors.add(i);
					value = value / i;
					factors.addAll(findPrimeFactors(value));
				}
			}
		}
		return factors;
	}

	private static boolean evenlyDivisible(long numerator, long divisor) {
		return numerator % divisor == 0;
	}
	
	static boolean isPrime(long value) {
		return isTwoWhichIsAlwaysPrime(value) ||
				(isOddWhichMayBePrime(value) && isOddNumberPrime(value));
	}
	
	private static boolean isTwoWhichIsAlwaysPrime(long value) {
		return value == 2;
	}
	
	private static boolean isOddWhichMayBePrime(long value) {
		return value % 2 != 0;
	}
	
	private static boolean isOddNumberPrime(long value) {
		for(long i = 3; i < value; i+=2) { //skip even numbers
			if(evenlyDivisible(value, i)) {
				return false;
			}
		}
		return true;
	}
	
	static Long findLargestFactor(TreeSet<Long> series) {
		return series.last();
	}
	
	public static void main(String[] args) {
		System.out.println(LargestPrimeFactor.compute(600851475143L));
	}
}
