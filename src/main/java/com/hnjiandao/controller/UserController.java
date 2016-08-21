package com.hnjiandao.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hnjiandao.domain.user.User;
import com.hnjiandao.service.UserService;

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
}
