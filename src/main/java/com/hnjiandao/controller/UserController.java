package com.hnjiandao.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hnjiandao.domain.User;
import com.hnjiandao.service.UserService;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	/**
	 * 普通请求例子
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/index")
	public String index(HttpServletRequest request, Model model) {
		
		User user = this.userService.selectByPrimaryKey("123");
		
		System.out.println("id=" + user.getUserId());
		System.out.println("id=" + user.getUserName());
		
		return "index";
	}
    
	/**
	 * restful 格式例子
	 * @param id
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/indexRs/{id}")
	public String indexRs(@PathVariable Long id, HttpServletRequest request, Model model) {
		
		System.out.println("id==" + id);
		return "index";
	}
	
	/**
	 * 返回对象json例子1
	 * @param userName
	 * @return
	 */
	@RequestMapping(value = "/print/{userName}", method = RequestMethod.GET)
	public @ResponseBody User printUser(@PathVariable("userName") String userName) {
		User user = new User();
		user.setUserId("userId112");
		user.setUserName(userName);
		return user;
	}
	
	/**
	 * 返回json例子2
	 * @param userName
	 * @return
	 */
	@RequestMapping(value = "/prints/{userName}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public @ResponseBody String printUserString(@PathVariable("userName") String userName) {
		return "{\"userId\":\"userId123\", \"userName\":\"" + userName + "\"}";
	}
}
