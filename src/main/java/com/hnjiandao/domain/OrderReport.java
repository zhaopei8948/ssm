package com.hnjiandao.domain;

import java.util.List;

public class OrderReport {	
	private OrderHeadReport OrderHead;
	private List<OverallDataBodyReport> OrderList;
	
	public OrderReport(OrderHeadReport orderHead,List<OverallDataBodyReport> orderList){
		this.OrderHead=orderHead;
		this.OrderList=orderList;		
	}
	
	public OrderHeadReport getOrderHead() {
		return OrderHead;
	}
	public void setOrderHead(OrderHeadReport orderHead) {
		OrderHead = orderHead;
	}
	public List<OverallDataBodyReport> getOrderList() {
		return OrderList;
	}
	public void setOrderList(List<OverallDataBodyReport> orderList) {
		OrderList = orderList;
	}
}
