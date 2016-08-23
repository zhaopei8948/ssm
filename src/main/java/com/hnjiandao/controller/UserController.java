package com.hnjiandao.controller;

import java.util.ArrayList;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hnjiandao.domain.User;

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
	 private static ArrayList<User> users = new ArrayList<User>(); 
	
	/**
	 * 注册首页 signup.jsp
	 */
	@RequestMapping("/register/signup")  
	public String signup(HttpServletRequest request,Model model){
		return "/register/signup";
	}
	
	@RequestMapping(value="/register/addUser", method={RequestMethod.POST})
    public @ResponseBody String printUser(@ModelAttribute @Validated User user, BindingResult result) {
        ModelAndView view = new ModelAndView("redirect:/post");
       
        
        user.setId( "1" + 1);
        System.out.println(user);
        user.getUsername();
        users.add(user);
        view.addObject("users", users);
        return "index";
    }
	
	 

}
