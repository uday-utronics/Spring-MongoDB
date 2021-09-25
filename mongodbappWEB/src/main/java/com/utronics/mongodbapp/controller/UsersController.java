package com.utronics.mongodbapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.utronics.mongodbapp.model.Users;
import com.utronics.mongodbapp.service.UserService;

@RestController
public class UsersController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String username, @RequestParam String password,@RequestParam int role) {
		Users u = userService.create(username, password, role);
		return u.toString();
	}
	
	@RequestMapping("/get")
	public Users getUsers(@RequestParam String username) {
		return userService.getByUsername(username);
	}
	
	@RequestMapping("/getAll")
	public List<Users> getAll(){
		return userService.getAll();
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		userService.deleteAll();
		return "deleted all records";
	}
	
	
}
