package com.userapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.userapp.entity.User;
import com.userapp.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService serv;
	

	@RequestMapping("/viewCreateUserPage")
	public String viewCreateUserPage() {
		return "view";
}
	@RequestMapping("/saveUser")
	public String saveOneUser(@ModelAttribute("user")User user,ModelMap model) {
		serv.saveLead(user);
		model.addAttribute("msg", "User saved");
		return"view";
}
	@RequestMapping("/listall")
	public String getAllUsers(ModelMap model) {
		List<User> users=serv.getUsers();
		model.addAttribute("users",users);
		return"user_result";
	}
	
	
	@RequestMapping("/delete")
	public String deleteLeadById(@RequestParam("id") long id,ModelMap model) {
				serv.deleteOneUser(id);
				List<User> users=serv.getUsers();
				model.addAttribute("users",users);
				model.addAttribute("msg", "User is deleted");
				return "user_result";
}	}
	
	