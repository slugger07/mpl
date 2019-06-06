package com.yash.plm.serviceimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.plm.db.JDBCUtil;
import com.yash.plm.exception.UserNotFoundException;
import com.yash.plm.model.User;
import com.yash.plm.service.UserService;

public class UserServiceImpl  extends JDBCUtil implements UserService {

	@Override
	public User getUser(String username, String password) throws UserNotFoundException {
		String sql = "select * from users where username = '"+ username +"' and password = '"+ password +"' ";
		User user = null;
		try {
			PreparedStatement pstmt = prepareStatement(sql);
			ResultSet res = pstmt.executeQuery();
			if(res.next()) {
				user = new User();
				user.setId(res.getInt("id"));
				user.setName(res.getString("name"));
				user.setPassword(res.getString("password"));
				user.setUsername(res.getString("username"));
			}
			else throw new UserNotFoundException("Invalid Login Details");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return user;
	}
}
