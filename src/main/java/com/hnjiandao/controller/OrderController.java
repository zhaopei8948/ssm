package com.hnjiandao.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class OrderController {
	@RequestMapping("/order")  
	public String signup(HttpServletRequest request,Model model){
		System.out.println("哈哈");
		
		
		return "/register/signup";
	}
}
