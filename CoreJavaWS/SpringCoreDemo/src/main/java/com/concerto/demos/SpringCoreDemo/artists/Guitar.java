package com.concerto.demos.SpringCoreDemo.artists;

import org.springframework.stereotype.Component;
// spring managed bean
@Component("guitar")
public class Guitar implements Instrument{

	@Override
	public void play() {
		System.out.println("playing guitar");
		
	}
	

}
