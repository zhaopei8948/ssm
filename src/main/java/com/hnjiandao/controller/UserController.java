package com.hnjiandao.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hnjiandao.domain.User;
import com.hnjiandao.service.UserService;
import com.hnjiandao.util.UUIDHelper;

/**
 * 注册方法
 *   验证：1.验证该海关备案代码是否本地注册过
 *       2.验证该海关备案代码是否海关备案
 *       3.验证邮箱
 *       4.验证其他的企业资质
 *       5.注册成功
 *
 */
@Controller
@RequestMapping("/jsp")
public class UserController {
	@Resource
	 private UserService userService;
	/**
	 * 注册首页 signup.jsp
	 */
	@RequestMapping("/register/signup")  
	public String signup(HttpServletRequest request,Model model){
		return"/register/signup";
	}
	/**
	 * 添加用户
	 * @param response
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/addUser",method= {RequestMethod.POST})
	@ResponseBody
	public ModelAndView addUser(HttpServletResponse response,User user) throws Exception {
		User u = new User();
		user.setId(UUIDHelper.getUUID()); 
		u = user;
		System.out.print(user);
		try{
			this.userService.insertByService(u);
		}catch(Exception e){
			return new ModelAndView("redirect:/jsp/register/signup");
		}
	    
		return new ModelAndView("redirect:/jsp/session/login");
	}
	/**
	 * 登录
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/session/login")  
	public String login(HttpServletRequest request,Model model){
		
		return"/session/login";
	}
	 

}
