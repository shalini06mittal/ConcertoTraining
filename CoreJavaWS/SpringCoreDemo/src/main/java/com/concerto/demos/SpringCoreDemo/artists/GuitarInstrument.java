package com.concerto.demos.SpringCoreDemo.artists;

import org.springframework.stereotype.Component;
// spring managed bean
//@Component("g1")
public class GuitarInstrument implements Instrument{

	@Override
	public void play() {
		System.out.println("playing guitar");
		
	}
	

}
