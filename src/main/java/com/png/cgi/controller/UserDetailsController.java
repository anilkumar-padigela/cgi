package com.png.cgi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.png.cgi.model.Store;
import com.png.cgi.model.UserDetails;
import com.png.cgi.services.UserDetailServiceImpl;

@RestController
public class UserDetailsController {

	

	
	
	@PostMapping(value="/register")
    public UserDetails registration(@RequestBody UserDetails user) {  
		
		UserDetailServiceImpl service = new UserDetailServiceImpl();
		user = service.registration(user);
			return user;
		    }	

	
	@PostMapping(value="/validateLogin")
    public UserDetails validateLogin(@RequestBody UserDetails user) {      	
			return user;		
    }	

	
	
}
