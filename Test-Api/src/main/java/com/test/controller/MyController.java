package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.User;
import com.test.service.ServiceImpl;

@RestController
public class MyController {
	
	
	@Autowired
	private ServiceImpl serviceImpl;

	
	
	@PostMapping("/")
	public User getUser( @RequestBody User user )
	{
		return serviceImpl.getData(user);
	}
	
	
	
	
}
