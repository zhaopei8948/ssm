package com.hnjiandao.user.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hnjiandao.user.domain.User;
import com.hnjiandao.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request, Model model) {
		String userId = request.getParameter("user_id");
		User user = this.userService.getUserById(userId);
		System.out.println(user.getUserId() + "[111]" + user.getUserName());
		
		return "index";
	}
}
