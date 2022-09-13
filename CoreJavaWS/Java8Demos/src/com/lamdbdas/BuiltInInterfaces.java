package com.lamdbdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInInterfaces {

	public static void main(String[] args) {
		//List<Integer> nos = new ArrayList<>();
		// varargs
//		
//		Consumer<Integer> c = new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				// TODO Auto-generated method stub
//				
//			}
//		};

		Consumer<Integer> c = t -> System.out.println(t);
		new Supplier<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		List<Integer> nos = Arrays.asList(12,3,4,56,35,234,24,23);
		nos.forEach((var t) -> System.out.println(t));
	}

}
