package com.hnjiandao.controller;

import java.util.HashMap;
import java.util.Map;

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
import com.hnjiandao.util.Helper;

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
		user.setId(Helper.getUUID());
		user.setPassword(Helper.encryptMD5(user.getPassword()));
		u = user;
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
	@RequestMapping(value="/createLogin",method={RequestMethod.POST})
	@ResponseBody
	public ModelAndView createLogin(HttpServletResponse response,HttpServletRequest request, Model model)throws Exception{
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String pwdMd5 = Helper.encryptMD5(password);
		Map userMap = new HashMap();
		ModelAndView mv= new ModelAndView();
		try{
			User user = this.userService.selectByName(name);
				if(pwdMd5.equals(user.getPassword())){
				    mv.setViewName("index");	
				
				}else{
					userMap.put("error", "用户名或者密码不正确！");
					mv.setViewName("/session/login");
					mv.addObject("userMap", userMap);
				}
		}catch (Exception e) {
			userMap.put("error", "用户不存在！");
			mv.setViewName("/session/login");
			mv.addObject("userMap", userMap);
		}
		return mv;
	}
}
