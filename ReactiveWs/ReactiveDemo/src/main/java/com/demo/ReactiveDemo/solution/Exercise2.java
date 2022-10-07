package com.demo.ReactiveDemo.solution;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here
    	
    	System.out.println("hello");
    	ReactiveSources.intNumbersFlux().subscribe(e-> System.out.println(e));
        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here
    	
    	ReactiveSources.userFlux().subscribe(user->System.out.println(user));

    	for(int i=1;i<=100;i++)
    		System.out.println(i+" : "+i*i);
        System.out.println("Press a key to end");
        System.in.read();
    }

}
