package com.hnjiandao.user.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hnjiandao.user.domain.User;
import com.hnjiandao.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/index")
	public String toIndex(HttpServletRequest request, Model model) {
		String userId = request.getParameter("user_id");
		User user = this.userService.getUserById(userId);
		System.out.println(user.getUserId() + "[111]" + user.getUserName());
		model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping
	public ModelAndView userList(HttpServletRequest request, Model model) {
		ModelAndView mv = new ModelAndView();
		
		String userId = request.getParameter("user_id");
		User user = this.userService.getUserById(userId);
		
		mv.addObject("user", user);
		mv.setViewName("user");
		
		return mv;
	}
}
