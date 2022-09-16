package com.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> intstream = 
		Stream.of(12,23,34,4,3,56,466,5,534,24,313,4,54,64,64,63,2,313,131,6,767,868);
		//intstream.sorted().forEach(System.out::println);
		List<Integer> l = intstream.parallel().sorted().collect(Collectors.toList());
		for(Integer n:l)
		System.out.println(n);
	}

}
