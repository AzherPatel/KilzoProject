package com.userapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userapp.entity.User;
import com.userapp.service.UserService;


@RestController
@RequestMapping("/api/User")

public class RestUser {
	@Autowired
	private UserService serv;

	@GetMapping 
	public List<User> getAllLeads(){
		
		List<User> users = serv.getUsers();
		return users;
		
	}
	@PostMapping 
	public List<User>SaveUsers(@RequestBody User user){
		 serv.saveLead(user);
		 return null;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOneLead(@PathVariable("id")long id){ 
	serv.deleteOneUser(id);		
	
}
	

}	

