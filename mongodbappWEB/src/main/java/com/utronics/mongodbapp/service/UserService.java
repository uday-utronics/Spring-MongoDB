package com.utronics.mongodbapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utronics.mongodbapp.model.Users;
import com.utronics.mongodbapp.repo.UserRepository;

@Service
public class UserService {

	 @Autowired
	 private UserRepository userRepository;
	
	//Create operation
	public Users create(String username, String password, int role) {
		return userRepository.save(new Users(username,password,role));
	}
	//Retrieve operation
	public List<Users> getAll(){
		return userRepository.findAll();
	}
	
	public Users getByUsername(String username) {
		return userRepository.findByUsernameEquals(username);
	}
	
	
	//Delete operation
	public void deleteAll() {
		userRepository.deleteAll();
	}
	
}
