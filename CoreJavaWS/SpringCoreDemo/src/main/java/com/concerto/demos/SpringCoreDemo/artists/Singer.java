package com.concerto.demos.SpringCoreDemo.artists;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Singer {
	
	@Value("Justin Beiber")
	private String singername;
	@Autowired
	@Qualifier("v1")
	private Instrument instrument;
	
	public Singer() {
		
		System.out.println("Singer constructor");
	}

	
	

	public void display() {
		System.out.println("Singer "+singername);
		instrument.play();
	}
	
	
	
}
