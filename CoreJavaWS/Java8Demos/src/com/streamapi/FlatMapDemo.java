package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<Integer> nos = Arrays.asList(1,2,3,4);
		// map
		System.out.println(nos.stream()
				.map(no -> Arrays.asList(no-1, no , no+1))
		.collect(Collectors.toList()));
		
		// flatmap
		System.out.println(nos.stream()
				.flatMap(no -> Arrays.asList(no-1, no , no+1).stream())
		.collect(Collectors.toList()));
		

	}

}
