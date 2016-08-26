package com.hnjiandao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hnjiandao.domain.Order;
import com.hnjiandao.domain.OrderHeadReport;
import com.hnjiandao.domain.OverallDataBodyReport;
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
		//orderService.updateOrder(order);
		System.out.println(orderService.isExists(order.getOrderHead().getOrderNo()));
		return order;
	}
	
	@RequestMapping(value="/getOrder",method=RequestMethod.GET)  
	@ResponseBody 
	public OrderHeadReport getOrder(){		
		OrderHeadReport order=orderService.getOrderHeadReport("c4f76a453cfd4b3b9d93add6063d4959");		
		return order;
	}
	
	@RequestMapping(value="/getOrderDetail",method=RequestMethod.GET)  
	@ResponseBody 
	public java.util.List<OverallDataBodyReport> getOrderDetail(){
		return orderService.getOverallDataBodyReports("001");
	}
}
