package com.github.service;

import java.io.Serializable;
import java.util.List;

import com.github.domain.UserTest;
import com.github.domain.UserTestExample;

public interface UserTestService extends Serializable {

	void insert(UserTest record);
	
	List<UserTest> selectByExample(UserTestExample example);
}
