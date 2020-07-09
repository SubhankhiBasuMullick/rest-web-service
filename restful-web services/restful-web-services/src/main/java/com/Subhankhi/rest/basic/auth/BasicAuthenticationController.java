package com.Subhankhi.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//@CrossOrigin("http://localhost:4200")
@RestController
public class BasicAuthenticationController {
	
	@GetMapping(path="/basicauth")
	public AuthenticationBean basicauthBean()
	{
		return new AuthenticationBean("You are authenticated");
	}

}
