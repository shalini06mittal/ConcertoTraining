package com.demo.ReactiveDemo;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        // TODO: Write code here

    	List<Integer> list =
    	ReactiveSources.intNumbersFlux().toStream()
    	.map(d->d*d)
    	.collect(Collectors.toList());
        
    	System.out.println(list);
    	System.out.println("Press a key to end");
        System.in.read();
    }

}
