package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.exception.UserException;
import com.user.model.User;
import com.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	//create
	@PostMapping("/user")
	public ResponseEntity<User> addUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.addUser(user), HttpStatus.CREATED);
	}
	
	//get 1 user
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable String id) throws UserException{
		return new ResponseEntity<User>(userService.getUserById(id), HttpStatus.OK);
	}
	
	//get all users
	@GetMapping("/user")
	public ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
	}
}
