package com.lamdbdas;

import java.util.Arrays;
import java.util.List;

class ValI implements Validate{

	@Override
	public boolean test(int t) {
		// TODO Auto-generated method stub
		return t%2==0;
	}
	
}
public class SumOfIntegers {
	public static int sumAll(List<Integer> numbers, Validate p) {
		int total = 0;
		for (int number : numbers) { // 12 3 4 5 6
			if (p.test(number)) {
				total += number;
			}
		}
		return total;
	}
	public static void main(String[] args) {
		Validate v = n -> n%2==0;
		int res = sumAll(Arrays.asList(12,3,4,5,6), n -> n%2==0);
		System.out.println(res);
	}

}
