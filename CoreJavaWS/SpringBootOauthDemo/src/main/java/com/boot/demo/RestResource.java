package com.boot.demo;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestResource {

	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	@GetMapping("/user")
	public String getUser(Principal p)
	{
		return "User :-> "+p.getName();
	}
}
