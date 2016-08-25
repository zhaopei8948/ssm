package com.hnjiandao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hnjiandao.domain.Order;
import com.hnjiandao.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	 private OrderService orderService;
	
	@RequestMapping(value="/newOrder",method=RequestMethod.POST)  
	@ResponseBody 
	public Order newOrder(String orderJson){		
		Order order=orderService.parseOrder(orderJson);
		orderService.saveOrder(order);
		return order;
	}
}
