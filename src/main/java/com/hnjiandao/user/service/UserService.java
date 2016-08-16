package com.hnjiandao.user.service;

import java.util.List;

import com.hnjiandao.user.domain.User;
import com.hnjiandao.user.domain.UserExample;

public interface UserService {

	void addUser(User user);
	
	User getUserById(String userId);
	
	List<User> selectByExample(UserExample example);
}
