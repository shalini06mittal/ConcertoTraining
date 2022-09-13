package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
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
		
		System.out.println("Streams strated...");
		Stream<Integer> liststream =  salaries.stream();
		Stream<Double> modlist = liststream.map(new Function<Integer, Double>() {
			//23,12,45,67,89,100
			@Override
			public Double apply(Integer t) {
				System.out.println("mapping => "+t);
				return t.intValue() + t.intValue() * 0.18;
			}
		});
		modlist.forEach(data -> System.out.println(data));
		
		salaries.stream()
		.map(sal -> sal.intValue() + sal.intValue() * 0.18)
		.forEach(v-> System.out.println(v));
		
	}
}
