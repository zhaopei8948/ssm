package com.hnjiandao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hnjiandao.domain.Order;
import com.hnjiandao.domain.OrderBaseTransfer;
import com.hnjiandao.domain.OrderClientReport;
import com.hnjiandao.domain.OrderHeadReport;
import com.hnjiandao.domain.OrderReport;
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
	public List<OverallDataBodyReport> getOrderDetail(){
		return orderService.getOverallDataBodyReports("001");
	}
	
	@RequestMapping(value="/getOrderReport", produces = "application/json; charset=utf-8",method=RequestMethod.GET)  
	@ResponseBody 
	public String getOrderReport(){
		OrderClientReport clientReport=new OrderClientReport();
		
		OrderHeadReport order=orderService.getOrderHeadReport("c4f76a453cfd4b3b9d93add6063d4959");	
		List<OverallDataBodyReport> orderList=orderService.getOverallDataBodyReports(order.getOrderNo());
		OrderBaseTransfer transfer=new OrderBaseTransfer("0x0","0x0","0x0","0x0");
		
		clientReport.setAuthentication_number("00100");
		clientReport.setOrder(new OrderReport(order,orderList));
		clientReport.setBaseTransfer(transfer);	
		
		Gson gson=new GsonBuilder().setLenient().setPrettyPrinting().create();
		String result=gson.toJson(clientReport);
		System.out.println(result);
		return result;
	}
}
