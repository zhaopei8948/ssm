package com.hnjiandao.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.hnjiandao.domain.UserTest;
import com.hnjiandao.service.UserTestService;

@RestController
public class UserTestController {

	@Resource
	private UserTestService userTestService;
	
	@RequestMapping("/getUserTest/{id}/{name}")
	public UserTest getUserTest(@PathVariable("id") String id, @PathVariable("name") String name) {
		UserTest ut = new UserTest();
		ut.setId(id);
		ut.setName(name);
		List<UserTest> userTestList = this.userTestService.selectAll();
		System.out.println(new Gson().toJson(userTestList));
		return ut;
	}
	
	@RequestMapping("/getAll/{name}")
	public List<UserTest> selectUserAll(@PathVariable("name") String name) {
//		return new Gson().toJson(this.userTestService.selectAll());
		return this.userTestService.selectAll();
	}
	
	/**
	 * 分页例子先调用PageHelper.startPage(页数，页大小)
	 * 再调用查询列表语句userTestService.selectAll()
	 * 把列表封装成PageInfo后就可以拿到分页的信息
	 * @return
	 */
	@RequestMapping("/selectAll")
	public String selectAll() {
		PageHelper.startPage(2, 3);
		List<UserTest> userTestList = this.userTestService.selectAll();
		PageInfo page = new PageInfo(userTestList);
		return new Gson().toJson(userTestList) + "[]" + page.getTotal() +
				"[]" + page.getFirstPage() + "[]" + page.getLastPage() + 
				"[]" + page.getPages();
	}
	
	@RequestMapping("createTestData/{count}")
	public String createTestData(@PathVariable("count") int count) {
		JsonObject result = new JsonObject();
		result.addProperty("SUCCESS", true);
		
		UserTest userTest = null;
		long tc = this.userTestService.count(new UserTest());
		for(int i = 0; i < count; i++) {
			userTest = new UserTest();
			userTest.setId("test_00" + (i + tc));
			userTest.setName("name_00" + (i + tc));
			this.userTestService.insert(userTest);
		}
		
		return result.toString();
	}
}
