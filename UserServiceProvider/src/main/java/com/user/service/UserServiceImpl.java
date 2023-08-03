package com.user.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.exception.UserException;
import com.user.model.User;
import com.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		
		String random = UUID.randomUUID().toString();
		user.setUserId(random);
		
		return userRepository.save(user);
	}

	@Override
	public User getUserById(String id) throws UserException {
		return userRepository.findById(id).orElseThrow(()-> new UserException("Resource not found with this id"));
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
