package com.hnjiandao.service;

import com.hnjiandao.domain.Order;
import com.hnjiandao.domain.OrderHeadReport;

public interface OrderService{
	Order parseOrder(String orderJson);
	Boolean saveOrder(Order order);
	Boolean updateOrder(Order order);	
	Integer isExists(String orderNo);
	
	OrderHeadReport getOrderHeadReport(String orderId);
}