package com.concerto.demos.SpringCoreDemo.artists;

import org.springframework.stereotype.Component;

//@Component("v1")
public class Violin implements Instrument{

	@Override
	public void play() {
		System.out.println("playing violin");
		
	}
	

}
