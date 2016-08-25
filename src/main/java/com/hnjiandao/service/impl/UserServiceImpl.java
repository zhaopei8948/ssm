package com.hnjiandao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnjiandao.dao.UserMapper;
import com.hnjiandao.domain.User;
import com.hnjiandao.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	public int insertByService(User user) {
		// TODO Auto-generated method stub
		return this.userMapper.insertByService(user) ;
	}

	public User selectByName(String username){
		return this.userMapper.selectByName(username);
	}

	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public User selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}


}
