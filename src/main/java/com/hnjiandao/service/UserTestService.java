package com.hnjiandao.service;

import java.util.List;

import com.hnjiandao.domain.UserTest;

public interface UserTestService {

	int insert(UserTest userTest);
	
	long count(UserTest userTest);
	
	List<UserTest> selectAll();
	
	UserTest selectByPrimaryKey(String id);
}
