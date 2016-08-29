package com.hnjiandao.domain;

public class OrderClientReport {
	private String authentication_number;
	private OrderReport Order;
	private OrderBaseTransfer BaseTransfer;
	
	
	public String getAuthentication_number() {
		return authentication_number;
	}
	public void setAuthentication_number(String authentication_number) {
		this.authentication_number = authentication_number;
	}
	public OrderReport getOrder() {
		return Order;
	}
	public void setOrder(OrderReport order) {
		Order = order;
	}
	public OrderBaseTransfer getBaseTransfer() {
		return BaseTransfer;
	}
	public void setBaseTransfer(OrderBaseTransfer baseTransfer) {
		BaseTransfer = baseTransfer;
	}
	
	
}
