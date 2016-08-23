package com.hnjiandao.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class UserController {
	 
	/**
	 * 注册首页 signup.jsp
	 */
	@RequestMapping("/register/signup")  
	public String signup(HttpServletRequest request,Model model){
		
		
		
		return "/register/signup";
	}
}
