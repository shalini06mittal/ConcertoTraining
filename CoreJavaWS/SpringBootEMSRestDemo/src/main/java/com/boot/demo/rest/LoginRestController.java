
package com.boot.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.demo.dto.AppResponse;
import com.boot.demo.dto.Messages;
import com.boot.demo.exception.InvalidCredentialsException;
import com.boot.demo.service.EmployeeService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
class Login
{
	private String username;
	private String password;
}
@RestController
//@CrossOrigin(methods = RequestMethod.POST, origins = "*")
public class LoginRestController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/login")
	public ResponseEntity<AppResponse> loginEmployee(@RequestBody Login login){
		System.out.println("email "+login.getUsername());
		System.out.println("password "+login.getPassword());
		try {
			if(employeeService.loginEmployee(login.getUsername(), login.getPassword()))
				return ResponseEntity.ok()
						.body(new AppResponse(Messages.SUCCESS, "Valid"));
		}catch(InvalidCredentialsException e) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
					.body(new AppResponse(Messages.FAILURE, e.getMessage()));
		}
		return ResponseEntity.ok()
				.body(new AppResponse(Messages.SUCCESS, "Valid"));
	}
	//	@PostMapping("/login")
	//	public ResponseEntity<AppResponse> loginEmployee(@RequestParam String username,
	//			@RequestParam String password)
	//	{
	//		System.out.println("email "+username);
	//		System.out.println("password "+password);
	//		return ResponseEntity.ok()
	//				.body(new AppResponse(Messages.SUCCESS, "Valid"));
	//	}

}
