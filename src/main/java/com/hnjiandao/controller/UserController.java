package com.hnjiandao.controller;


import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hnjiandao.domain.User;
import com.hnjiandao.service.UserService;
import com.hnjiandao.util.Helper;


/**
 * @author dingfj
 * @param response
 * @param user
 * @return
 * @throws Exception
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
	@Autowired
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
		ModelAndView mv= new ModelAndView();
		user.setId(Helper.getUUID());
		user.setPassword(Helper.encryptMD5(user.getPassword()));
		u = user;
		try{
			this.userService.insertByService(u);
			String[] arr = {u.getEmail(),"公共申报系统--注册"};
			EmailController.args(arr);
			mv.setViewName("redirect:/jsp/session/login");
		}catch(Exception e){
			mv.setViewName("redirect:/jsp/register/signup");;
		}
		return  mv;
	}
	/**
	 * 登录
	 * @param request
	 * @param model
	 * @return
	 * @throws MessagingException 
	 */
	@RequestMapping("/session/login")  
	public String login(HttpServletRequest request,Model model) {
		
		return"/session/login";
	}
	@RequestMapping(value="/createLogin",method={RequestMethod.POST})
	@ResponseBody
	public ModelAndView createLogin(HttpSession session,HttpServletResponse response,HttpServletRequest request, Model model)throws Exception{
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String pwdMd5 = Helper.encryptMD5(password);
		Map userMap = new HashMap();
		ModelAndView mv= new ModelAndView();
			User user = this.userService.selectByName(name);
				if(user==null){
					userMap.put("error", "用户不存在！");
					mv.setViewName("/sesson/login");
					mv.addObject("userMap", userMap);
				}
			
				if(!pwdMd5.equalsIgnoreCase(user.getPassword())){
					userMap.put("error", "用户名或者密码不正确！");
					mv.setViewName("/session/login");
					mv.addObject("userMap", userMap);	
				}else{
					mv.setViewName("index");
				}
		//储存用户session
		session.setAttribute("user", user);
		return mv;
	}
	
	//用户退出
	@RequestMapping("/logout")
	public String logout(HttpSession session)throws Exception{
		session.invalidate();
	
		return "redirect:/jsp/session/login";
	}
	
	/**
	 * 邮箱验证
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/register/emailActivate")  
	public String emailActivate(HttpServletRequest request,Model model) {
		
		return"/register/emailActivate";
	}
	/**
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/register/emailUp")
	public String emailUp(HttpServletRequest request,Model model){
		
		return "/register/emailUp";
	}
	
	@RequestMapping(value="/emailFix", method={RequestMethod.POST})
	@ResponseBody
	public ModelAndView emailFix(HttpServletRequest request,HttpServletResponse response,Model model){
		ModelAndView mv = new ModelAndView();
		String email = request.getParameter("email");
		System.out.println(email);
		mv.setViewName("/register/emailActivate");
		return mv;
	}
	
	
}
