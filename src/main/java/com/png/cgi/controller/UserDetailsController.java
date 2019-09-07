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

@RestController
public class UserDetailsController {

	
	@PostMapping(value="/register")
    public String registration(@RequestBody UserDetails user) {    
			return "success";
		    }	

	
	@PostMapping(value="/validateLogin")
    public UserDetails validateLogin(@RequestBody UserDetails user) {      	
			return user;		
    }	

	
	
}
