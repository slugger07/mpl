package com.yash.plm.service;

import com.yash.plm.exception.UserNotFoundException;
import com.yash.plm.model.User;

public interface UserService {
	User getUser(String username,String password) throws UserNotFoundException;
}
