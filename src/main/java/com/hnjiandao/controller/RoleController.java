package com.hnjiandao.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hnjiandao.domain.Role;
import com.hnjiandao.service.RoleService;
import com.hnjiandao.util.Helper;

@Controller
@RequestMapping("/jsp")
public class RoleController {
@Autowired
private RoleService roleService;
	/**
	 * list
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/role/index")
	public ModelAndView index(HttpServletRequest request,Model model){
		ModelAndView mv= new ModelAndView();
		List<Role> roles;
		try{
			 roles = (List<Role>) roleService.selectAll();
			 mv.setViewName("/role/index");
			 mv.addObject("roles",roles);
		}catch (Exception e) {
			 roles = null;
		}
		return mv;
	}
	/**
	 * show
	 * @param id
	 * @return
	 */
	@RequestMapping("/role/{id}/show")
	public ModelAndView show(@PathVariable("id") String id){
		ModelAndView mv = new ModelAndView();
		Role role = new Role();
		try{
			role = roleService.selectByPrimaryKey(id);
		mv.setViewName("role/show");
			mv.addObject("role",role);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return mv;
	}
	
	@RequestMapping("/role/newRole")
	public String newRole(HttpServletRequest request,Model model){
		return "/role/newRole";
	}
	
	/**
	 * addRole
	 * @param respose
	 * @param role
	 * @return
	 */
	@RequestMapping(value="/addRole" , method= {RequestMethod.POST})	
	@ResponseBody
	public ModelAndView addRole(HttpServletResponse respose,Role role){
		ModelAndView mv = new ModelAndView();
		Role r = new Role();
		r.setId(Helper.getUUID());
		r.setName(role.getName());
		r.setCreateTime(Helper.nowDate());
		r.setUpdateTime(Helper.nowDate());
		
		this.roleService.insertSelective(r);
		mv.setViewName("redirect:/jsp/role/index");
		mv.addObject("message","添加成功");
		
		return mv;
	}

	
	
}
