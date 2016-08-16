package com.hnjiandao.user.service.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hnjiandao.user.domain.User;
import com.hnjiandao.user.domain.UserExample;
import com.hnjiandao.user.service.UserService;

public class UserServiceTest {

	private UserService userService;
	
	@Before
	public void before() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"spring/ApplicationContext.xml"});
		this.userService = (UserService) ac.getBean("userService");
	}
	
//	@Test
//	public void testAddUser() {
//		User user = new User();
//		user.setUserId("1235");
//		user.setUserName("user_1235");
//		this.userService.addUser(user);
//	}
	
//	@Test
//	public void testGetUserById() {
//		User user = this.userService.getUserById("1234");
//		System.out.println(user.getUserId() + "[==]" + user.getUserName());
//	}

//	@Test
//	public void testSelectByExample() {
//		UserExample example = new UserExample();
//		example.createCriteria().andUserNameEqualTo("user_1234");
//		List<User> userList = this.userService.selectByExample(example);
//		System.out.println(userList.get(0).getUserId() + "|||" + userList.get(0).getUserName());
//	}
	
}
