package com.hnjiandao.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnjiandao.user.dao.UserMapper;
import com.hnjiandao.user.domain.User;
import com.hnjiandao.user.domain.UserExample;
import com.hnjiandao.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.userMapper.insert(user);
	}

	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public List<User> selectByExample(UserExample example) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByExample(example);
	}

}
