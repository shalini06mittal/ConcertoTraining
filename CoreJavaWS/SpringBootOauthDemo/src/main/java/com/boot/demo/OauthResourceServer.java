package com.boot.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class OauthResourceServer extends ResourceServerConfigurerAdapter{
	//Above config enable protection on all endpoints starting /user. All other endpoints can be accessed freely.
		public OauthResourceServer() {
			System.out.println("resource server");
		}
		@Override
		public void configure(HttpSecurity http) throws Exception {
			System.out.println("http");
			http
	        	.authorizeRequests()
	        	.antMatchers("/user").authenticated()
	        	.antMatchers("/").permitAll();
		}
}
