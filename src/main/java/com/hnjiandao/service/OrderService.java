package com.hnjiandao.service;

import com.hnjiandao.domain.Order;

public interface OrderService{
	Order parseOrder(String orderJson);
	Boolean saveOrder(Order order);
	Boolean updateOrder(Order order);	
	Integer isExists(String orderNo);
}