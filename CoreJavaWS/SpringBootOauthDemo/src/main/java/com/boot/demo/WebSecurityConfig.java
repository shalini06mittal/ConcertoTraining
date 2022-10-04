package com.boot.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@Order(1)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	public WebSecurityConfig() {
		System.out.println("web security config");
	}
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("shalini")
		.password(passwordEncoder().encode("123")).roles("USER");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
    	.antMatcher("/**")
        	.authorizeRequests()
        	.antMatchers("/oauth/authorize**", "/login**", "/error**","/")
        	.permitAll()
    	.and()
        	.authorizeRequests()
        	.anyRequest().authenticated()
    	.and()
    		.formLogin().permitAll();
	}
}
