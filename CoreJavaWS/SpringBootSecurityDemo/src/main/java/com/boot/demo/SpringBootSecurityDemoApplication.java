package com.boot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.boot.demo.entity.LoginUser;
import com.boot.demo.repo.LoginUserRepo;

@SpringBootApplication
public class SpringBootSecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
	}

	@Autowired
	private LoginUserRepo loginUserRepo;
	
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Bean
	public void initialize()
	{
		loginUserRepo.save(new LoginUser("user1", encoder.encode("user1"), "USER"));
		loginUserRepo.save(new LoginUser("user2",  encoder.encode("user2"), "USER"));
		loginUserRepo.save(new LoginUser("user3",  encoder.encode("user2"), "USER"));
		loginUserRepo.save(new LoginUser("admin",  encoder.encode("admin123"), "ADMIN"));
	}
	
	
	
}
