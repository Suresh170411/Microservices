package com.user.service;

import java.util.List;

import com.user.exception.UserException;
import com.user.model.User;

public interface UserService {

	public User addUser(User user);
	public User getUserById(String id) throws UserException;
	public List<User> getAllUsers();
}
