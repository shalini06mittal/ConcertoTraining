package com.boot.demo.rest;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String hello()
	{
		return "hello message";
	}
	
	@GetMapping("/user")
	public String loggedInUser(Principal p)
	{
		return "hello user "+p.getName();
	}
	@GetMapping("/dashboad")
	public String userDashBoard()
	{
		return "user dashboard";
	}
}
