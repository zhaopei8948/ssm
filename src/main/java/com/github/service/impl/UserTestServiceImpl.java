package com.github.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.dao.UserTestMapper;
import com.github.domain.UserTest;
import com.github.domain.UserTestExample;
import com.github.service.UserTestService;

@Service
public class UserTestServiceImpl implements UserTestService {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -794860899348394824L;

	@Autowired
	private UserTestMapper userTestMapper;
	
	public void insert(UserTest record) {
		this.userTestMapper.insert(record);
	}

	public List<UserTest> selectByExample(UserTestExample example) {
		return this.userTestMapper.selectByExample(example);
	}

}
