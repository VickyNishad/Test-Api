package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.test.model.TestApi;
import com.test.model.User;

@Service
public class ServiceImpl {
	
	
	@Autowired
	RestTemplate restTemplate = new RestTemplate();
	
//	public User getData()
//	{
//		String url = "https://jsonplaceholder.typicode.com/todos/1";
//		User user = restTemplate.getForObject(url, User.class);
//		
//		return user;
//	}

//	public User getData(String name, String job) {
//		// TODO Auto-generated method stub
//		String url = "https://reqres.in/api/users";
//		
//		ResponseEntity<User> user = restTemplate.postForObject(url ,User.class, name, job);
//		System.out.println(user);
//		return user.getBody();
//	}

	
	
	public User getData(User user) {
		// TODO Auto-generated method stub\
		
		String url = "https://reqres.in/api/users";
		ResponseEntity<User> responseEntity = restTemplate.postForEntity(url, user, User.class);
		
		
		System.out.println(responseEntity);
		
		
		return responseEntity.getBody();
	}

	
	





	
}
