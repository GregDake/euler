package com.gregdake.euler.q2;

import java.util.ArrayList;
import java.util.List;

public class EvenFibonacciNumbers {
	
	public static Long compute(int ceiling) {
		List<Integer> series = calculateFibonacciSeriesFor(ceiling);
		System.out.println("Fibonaccia series is: " + series);
		List<Integer> filtered = findEvenTerms(series);
		System.out.println("Evens only is: " + filtered);
		Long sum = 0L;
		for(int val : filtered) {
			sum += val;
		}		
		return sum;
	}
	
	static List<Integer> calculateFibonacciSeriesFor(int ceiling) {
		List<Integer> series = new ArrayList<>();
		int currentMinus2 = 1;
		int currentMinus1 = 2;
		int current = 0;
		series.add(currentMinus2);
		series.add(currentMinus1);
		while(true) {
			current = currentMinus2 + currentMinus1;
			currentMinus2 = currentMinus1;
			currentMinus1 = current;
			if(current <= ceiling) {
				series.add(current);
			}
			else {
				break;
			}
		}
		return series;
	}
	
	static List<Integer> findEvenTerms(List<Integer> series) {
		List<Integer> even = new ArrayList<>();
		for(int entry : series) {
			if(entry % 2 == 0) {
				even.add(entry);
			}
		}
		return even;
	}
	
	public static void main(String[] args) {
		System.out.println(EvenFibonacciNumbers.compute(4000000));
	}
}
