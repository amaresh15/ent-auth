package com.ami.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ami.dao.UserRepository;
import com.ami.entities.User;

/**
 * 
 * @author amaresh.kumar
 *
 */
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User save(User user) {
		return userRepository.save(user);
	}

	public User update(User user) {
		return userRepository.save(user);
	}

	public User find(String userName) {
		return userRepository.findOneByUsername(userName);
	}

	public User findByID(String id) {
		return userRepository.findOne(id);
	}
	
	public String repositoryType() {
		System.out.println("Repository Type: " + userRepository.getClass());
		
		return "Repository Using: " + userRepository.getClass();
	}
}
