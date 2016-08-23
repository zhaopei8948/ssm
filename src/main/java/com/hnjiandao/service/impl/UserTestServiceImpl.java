package com.hnjiandao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnjiandao.dao.UserTestMapper;
import com.hnjiandao.domain.UserTest;
import com.hnjiandao.service.UserTestService;

@Service("userTestService")
public class UserTestServiceImpl implements UserTestService {

	@Autowired
	private UserTestMapper userTestMapper;
	

	public int insert(UserTest userTest) {
		// TODO Auto-generated method stub
		return this.userTestMapper.insert(userTest);
	}


	public UserTest selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return this.userTestMapper.selectByPrimaryKey(id);
	}


	public long count(UserTest userTest) {
		// TODO Auto-generated method stub
		return this.userTestMapper.count(userTest);
	}


	public List<UserTest> selectAll() {
		// TODO Auto-generated method stub
		return this.userTestMapper.selectAll();
	}

}