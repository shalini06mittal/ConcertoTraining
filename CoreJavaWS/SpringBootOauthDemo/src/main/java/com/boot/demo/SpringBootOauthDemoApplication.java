package com.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//http://localhost:8080/oauth/authorize?client_id=client1&response_type=code&scope=read_profile_info


@SpringBootApplication
public class SpringBootOauthDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOauthDemoApplication.class, args);
	}

	
}
