package com.hnjiandao.service.impl;

import com.hnjiandao.domain.Order;
import com.hnjiandao.domain.OrderDetail;
import com.hnjiandao.domain.OrderHead;
import com.hnjiandao.service.OrderService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class OrderServiceImpl implements OrderService {
	public Order parseOrder(String orderJson) {
		Order order = new Order();

		JSONObject olderJson = JSONObject.fromObject(orderJson);
		JSONArray josnOrderList = olderJson.getJSONArray("OrderList");

		order.setAuthentication_number(olderJson.getString("authentication_number"));
		order.setOrderHead(new OrderHead(JSONObject.fromObject(olderJson.get("OrderHead"))));

		for (int i = 0; i < josnOrderList.size(); i++) {
			order.getOrderList().add(new OrderDetail(JSONObject.fromObject(josnOrderList.getString(i))));
		}

		return order;
	}

	public Boolean saveOrder(Order order) {

		return null;
	}

	public Boolean updateOrder(Order order) {

		return null;
	}
}