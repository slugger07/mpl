package com.yash.plm.test;

import com.yash.plm.exception.UserNotFoundException;
import com.yash.plm.model.User;
import com.yash.plm.service.UserService;
import com.yash.plm.serviceimpl.UserServiceImpl;

public class UserServiceImplGetUserTest {

	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		try {
			User user = userService.getUser("dilip", "abc123");
			System.out.println(user);
		} catch (UserNotFoundException e) {
			System.out.println("user not found");
		}
		
	}

}
