package com.boot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import com.boot.demo.service.LoginUserDetailsService;

// https://www.baeldung.com/spring-deprecated-websecurityconfigureradapter
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private LoginUserDetailsService loginUserDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("authentication...");
//		auth.inMemoryAuthentication()
//		.withUser("user1").password(encoder().encode("user1")).roles("USER")
//		.and()
//		.withUser("user2").password(encoder().encode("user2")).roles("USER")
//		.and()
//		.withUser("admin").password(encoder().encode("admin")).roles("ADMIN");
		
		auth.userDetailsService(loginUserDetailsService);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// to bypass spring security and permit request to all url
		//http.authorizeHttpRequests().anyRequest().permitAll();
		
		// to permit request to / and login , logout but authenticate
		// all other urls
//		http.authorizeRequests().antMatchers("/").permitAll()
//		.anyRequest().authenticated().and().formLogin().and().logout();
		
//		http.authorizeRequests().antMatchers("/").permitAll()
//		.antMatchers("/user/**","/dashboard").hasAnyAuthority("ADMIN","USER")
//		.antMatchers("/admin").hasAnyAuthority("ADMIN")
//		.anyRequest().authenticated().and().formLogin().and().logout();
		
		http.authorizeRequests().antMatchers("/").permitAll()
		.antMatchers("/user/**","/dashboard").hasAnyAuthority("ADMIN","USER")
		.antMatchers("/admin").hasAnyAuthority("ADMIN")
		.anyRequest().authenticated().and().httpBasic().and().logout();
		
		
	}
	
	@Bean
	public PasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/h2-console/**");
	}
}
