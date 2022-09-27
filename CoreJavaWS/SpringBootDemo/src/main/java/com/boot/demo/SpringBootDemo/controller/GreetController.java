package com.boot.demo.SpringBootDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

	@GetMapping("/greet")
	public String greetMessage()
	{
		return "greet";
	}
}
