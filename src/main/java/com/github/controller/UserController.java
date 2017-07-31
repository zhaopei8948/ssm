package com.github.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.domain.UserTest;
import com.github.service.UserTestService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserTestService userTestService;
	
	@RequestMapping("/testInsert")
	@ResponseBody
	public UserTest testInsert(UserTest userTest) {
		this.userTestService.insert(userTest);
		return userTest;
	}
	
	@RequestMapping("/testSelectAll")
	@ResponseBody
	public List<UserTest> testSelectAll() {
		return this.userTestService.selectByExample(null);
	}
}
