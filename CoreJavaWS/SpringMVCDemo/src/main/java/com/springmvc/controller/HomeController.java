package com.springmvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.entity.LoginUser;
import com.springmvc.logindatabase.LoginDataBase;
@Controller
public class HomeController {
	@Autowired
	private LoginDataBase loginDatabase;

	public HomeController(){
		System.out.println("Home controller constructor");
	}
	@RequestMapping("/")
	public String greet(){
		System.out.println("greet");
		return "index";
	}
	@GetMapping("/register")
	public String registerUser(){
		System.out.println("register");
		return "register";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/login")
	public String loginUser(@RequestParam(required=false) String errormsg ,Map<String, String> map){
		if(errormsg!=null) 
			map.put("errormsg", errormsg);
		System.out.println("login");
		return "login";
	}
	
	@PostMapping("/register")
	public String insertUser(LoginUser user){
		System.out.println("insert post");
		System.out.println(user);
		if(user.getUsername()!=null && user.getEmail()!=null&&user.getPassword()!=null) {
			loginDatabase.insertUser(user);
			return "login";
		}
	return "register";
	}
	
	
	@PostMapping("/login")
	public String validateUser(LoginUser user,Map<String, String> map){
		System.out.println("login post");
		System.out.println(user);
		if(loginDatabase.validateUser(user)) {
			return "dashboard";
		}
		map.put("email", user.getEmail());
		return "redirect:login?errormsg= Invalid User";
	}
//	@PostMapping("/login")
//	public String validateUser(@RequestParam String email,
//			@RequestParam String password){
//		System.out.println("login post");
//		System.out.println(email);
//		
//		return "index";
//	}
	
}
