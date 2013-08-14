package com.gregdake.euler.q1;

import java.util.ArrayList;
import java.util.List;

public class MultiplesOf3And5 {
	
	public static int compute(int ceiling) {
		List<Integer> toSum = findMultiplesOf3Or5(ceiling);
		int sum = 0;
		for(int val : toSum) {
			sum += val;
		}
		
		return sum;
	}
	
	static List<Integer> findMultiplesOf3Or5(int ceiling) {
		List<Integer> toSum = new ArrayList<>();
		for(int i = 1; i < ceiling; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				toSum.add(i);
			}
		}
		return toSum;
	}
	
	public static void main(String[] args) {
		System.out.println(MultiplesOf3And5.compute(1000));
	}
}
