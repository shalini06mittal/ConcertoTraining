
package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		/**
		 * each value => +5% => map
		 * filter the employees sal <  =.  filter
		 * list of temperatures => average reduce
		 *  
		 * display foreach
		 * store the result tolist
		 */
		// Stream API
		/**
		 * will not modify the original list
		 * once the stream is opened, operated closed
		 * 
		 * intermediate =>  map , filter , reduce
		 * terminal => foreach
 		 */
		List<Integer> salaries = Arrays.asList(23,12,45,67,89,100);
//		System.out.println("Streams strated...");
//		Stream<Integer> liststream =  salaries.stream();
//		// map
//		Stream<Double> modlist = liststream.map(new Function<Integer, Double>() {
//			//23,12,45,67,89,100
//			@Override
//			public Double apply(Integer t) {
//				System.out.println("mapping => "+t);
//				return t.intValue() + t.intValue() * 0.18;
//			}
//		});
//		modlist.forEach(data -> System.out.println(data));
//		//filter
//		salaries.stream()
//		.map(sal -> sal.intValue() + sal.intValue() * 0.18)
//		.forEach(v-> System.out.println(v));
//		long c =  salaries.stream().filter(no -> no>=50)
//		.count();
//		System.out.println(c);
		//reduce 23,12,45,67,89,100
		int sum = salaries.get(0); //23
		for(int i=1;i<salaries.size();i++)
			sum = sum+ salaries.get(i);
		
		int res = salaries.stream().reduce(new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer sum, Integer u) {
				System.out.println("sum : "+sum); // 23
				System.out.println("u : "+u); // 12
				return sum + u;
			}
		}).get();
		//System.out.println(res);
		System.out.println();
//		res = salaries.stream().reduce(0,new BinaryOperator<Integer>() {
//			
//			@Override
//			public Integer apply(Integer sum, Integer u) {
//				System.out.println("sum : "+sum); // 23
//				System.out.println("u : "+u); // 12
//				return sum + u;
//			}
//		});
		res = salaries.stream().reduce((s, val)-> s+val).get();
		res = salaries.stream().reduce(0,(s, val)-> s+val);
		
		salaries = new ArrayList<>();
		//System.out.println(salaries.size());
		res = salaries.stream().reduce(0,(s, val)-> {
			System.out.println("in reduce");
			System.out.println(s+" : "+val);
			return s+val;
		});
		
		System.out.println(res);
		
		Optional<Integer> opt = salaries.stream().reduce((s, val)-> {
			System.out.println("in reduce");
			System.out.println(s+" : "+val);
			return s+val;
		});
		
		if(opt.isPresent())
			System.out.println(opt.get());
		else
			System.out.println("list is empty");
		
		
		
		
		//System.out.println(salaries.get(0));
//		List<String> l = new ArrayList<>();
//		l.add(null);
//		System.out.println(l.size());
//		System.out.println(l.get(0).toLowerCase());
		
	}
	
}







