package com.hnjiandao.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OrderController {
	@RequestMapping(value="/new",method=RequestMethod.POST)  
	@ResponseBody 
	public Map<String,String> newOrder(String orderJson){		
		Map<String,String> map=new HashMap();
		map.put("word", orderJson);
		//System.out.println(orderJson);
		return map;
	}
}
