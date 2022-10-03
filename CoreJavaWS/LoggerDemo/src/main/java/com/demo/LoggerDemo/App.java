package com.demo.LoggerDemo;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App 
{
	private static Logger logger = Logger.getLogger(App.class.getName());
	
    public static void main( String[] args ) throws SecurityException, IOException
    {
    	Handler handler = new FileHandler("app.log",2000,5);
    
    	handler.setFormatter(new MyFormatter());
    	logger.addHandler(handler);
    
    	
    	Handler handler1 = new FileHandler("app.html");
        
    	handler1.setFormatter(new MyHTMLFormatter());
    	logger.addHandler(handler1);
    	//logger.log(Level.INFO, "logger created");
    	logger.setLevel(Level.INFO);
    	for(int i=1;i<=5;i++)
    		logger.log(Level.INFO, "logger created");
    	
    	
//        logger.log(Level.SEVERE, "contact admin");
//        logger.log(Level.WARNING, "Do not do this");
        System.out.println("end");
    }
}
