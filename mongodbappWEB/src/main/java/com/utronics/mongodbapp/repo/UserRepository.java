package com.utronics.mongodbapp.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.utronics.mongodbapp.model.Users;

@Repository
public interface UserRepository extends MongoRepository<Users, String> {

	Users findByUsernameEquals(String username);
	List<Users> findByRole(int role);
}
