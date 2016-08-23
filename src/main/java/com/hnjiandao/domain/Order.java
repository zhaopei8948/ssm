package com.hnjiandao.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String authentication_number;
	private OrderHead orderHead;
	private List<OrderDetail> orderList;
	
	public Order(){
		orderHead=new OrderHead();
		orderList=new ArrayList<OrderDetail>();
	}

	public String getAuthentication_number() {
		return authentication_number;
	}

	public void setAuthentication_number(String authentication_number) {
		this.authentication_number = authentication_number;
	}

	public OrderHead getOrderHead() {
		return orderHead;
	}

	public void setOrderHead(OrderHead orderHead) {
		this.orderHead = orderHead;
	}

	public List<OrderDetail> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<OrderDetail> orderList) {
		this.orderList = orderList;
	}
}