package com.hnjiandao.service;

import java.util.List;

import com.hnjiandao.domain.Order;
import com.hnjiandao.domain.OrderHeadReport;
import com.hnjiandao.domain.OverallDataBodyReport;

public interface OrderService{
	Order parseOrder(String orderJson);
	Boolean saveOrder(Order order);
	Boolean updateOrder(Order order);	
	Integer isExists(String orderNo);
	
	OrderHeadReport getOrderHeadReport(String orderId);
	
	List<OverallDataBodyReport> getOverallDataBodyReports(String orderId);
}