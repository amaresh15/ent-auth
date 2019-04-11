package com.ami.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ami.entities.User;
import com.ami.services.UserService;
import com.ami.util.CustomErrorType;

/**
 * 
 * @author amaresh.kumar
 *
 */
@RestController
@RequestMapping("account")
public class AccountController {

	public static final Logger logger = LoggerFactory.getLogger(AccountController.class);

	@Autowired
	private UserService userService;

	// request method to create a new account by a guest
	@CrossOrigin
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody User newUser) {
		if (userService.find(newUser.getUsername()) != null) {
			logger.error(String.format("username Already exist {0}", newUser.getUsername()));
			return new ResponseEntity<CustomErrorType>(
					new CustomErrorType(String.format("user with username {0} {1}", newUser.getUsername(), "already exist ")),
					HttpStatus.CONFLICT);
		}
		newUser.setRole("USER");

		return new ResponseEntity<User>(userService.save(newUser), HttpStatus.CREATED);
	}

	// this is the login api/service
	@CrossOrigin
	@RequestMapping("/login")
	public Principal user(Principal principal) {
		logger.info("user logged ", principal);
		return principal;
	}

	// this is the login api/service
	@CrossOrigin
	@RequestMapping("/testRepo")
	public String testRepo() {
		logger.info("Repository Type: ", userService);
		return userService.repositoryType();
	}

}
