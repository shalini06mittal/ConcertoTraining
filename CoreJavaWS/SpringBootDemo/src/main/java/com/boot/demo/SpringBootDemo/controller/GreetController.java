package com.boot.demo.SpringBootDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetController {

	@GetMapping("/greet")
	public String greetMessage()
	{
		return "greet";
	}
}
