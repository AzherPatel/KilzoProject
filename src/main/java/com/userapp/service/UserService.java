package com.userapp.service;


import java.util.List;

import com.userapp.entity.User;


public interface UserService {

	public void saveLead(User user);

	

	public void deleteOneUser(long id);



	public List<User> getUsers(); 
		
	

}
