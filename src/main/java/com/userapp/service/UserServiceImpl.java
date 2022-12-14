package com.userapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userapp.entity.User;
import com.userapp.repository.UserRepository;
@Service

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void saveLead(User user) {
		userRepo.save(user);
		
	}

	@Override
	public void deleteOneUser(long id) {
		userRepo.deleteById(id);
		
	}

	@Override
	public List<User> getUsers() {
		List<User> users = userRepo.findAll();
		return users;
	}


}
