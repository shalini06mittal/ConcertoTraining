package com.boot.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.demo.entity.JwtResponse;
import com.boot.demo.entity.LoginUser;
import com.boot.demo.service.LoginUserDetailsService;
import com.boot.demo.utility.JwtUtility;

@RestController
public class LoginRestController {

	@Autowired
	private JwtUtility jwtUtility;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private LoginUserDetailsService lDetailsService;
	
	@PostMapping("/auth")
	public ResponseEntity<JwtResponse> authenticateUser(
			@RequestBody LoginUser user)
	{
		System.out.println("Authentication "+user.getUsername());
		
		try {
			authenticationManager.authenticate(new 
					UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())
					);
		}catch(BadCredentialsException e)
		{
			ResponseEntity.status(HttpStatus.BAD_REQUEST);
		}
		final UserDetails userDetails = lDetailsService.loadUserByUsername(user.getUsername());
		final String jwt = jwtUtility.generateToken(userDetails);
		JwtResponse resp = new JwtResponse();
		resp.setJwt(jwt);
		return ResponseEntity.ok(resp);
	}
}









