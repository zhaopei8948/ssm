package com.hnjiandao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hnjiandao.domain.Order;
import com.hnjiandao.service.OrderService;
import com.hnjiandao.service.impl.OrderServiceImpl;

@Controller
@RequestMapping("/order")
public class OrderController {
	@RequestMapping(value="/newOrder",method=RequestMethod.POST)  
	@ResponseBody 
	public Order newOrder(String orderJson){
		OrderService service=new OrderServiceImpl();
		Order order=service.parseOrder(orderJson);
		System.out.println(order);
		return order;
	}
}
