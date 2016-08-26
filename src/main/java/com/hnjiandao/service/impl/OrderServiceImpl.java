package com.hnjiandao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnjiandao.dao.OverallDataBodyMapper;
import com.hnjiandao.dao.OverallDataHeadMapper;
import com.hnjiandao.dao.UserMapper;
import com.hnjiandao.domain.Order;
import com.hnjiandao.domain.OrderDetail;
import com.hnjiandao.domain.OrderHead;
import com.hnjiandao.domain.OrderHeadReport;
import com.hnjiandao.domain.OverallDataBody;
import com.hnjiandao.domain.OverallDataHead;
import com.hnjiandao.service.OrderService;
import com.hnjiandao.util.Helper;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OverallDataHeadMapper orderheader;

	@Autowired
	private OverallDataBodyMapper orderDetail;

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
		OverallDataHead head = new OverallDataHead(Helper.getUUID(), order.getOrderHead());

		if (orderheader.isExists(order.getOrderHead().getOrderNo()) == 0) {
			orderheader.insertSelective(head);

			for (OrderDetail detail : order.getOrderList()) {
				OverallDataBody body = new OverallDataBody(Helper.getUUID(), head.getId(), head.getOrderNo(),detail);
				orderDetail.insertSelective(body);
			}
		}
		else{
			updateOrder(order);
		}

		return null;
	}

	public Boolean updateOrder(Order order) {
		OverallDataHead head = new OverallDataHead(Helper.getUUID(), order.getOrderHead());
		orderheader.updateByOrderNoSelective(head);

		orderDetail.deleteByOrderId(head.getOrderNo());

		String orderId = orderheader.getOrderId(head.getOrderNo());

		for (OrderDetail detail : order.getOrderList()) {
			OverallDataBody body = new OverallDataBody(Helper.getUUID(), orderId, head.getOrderNo(), detail);
			orderDetail.insertSelective(body);
		}

		return true;
	}

	public Integer isExists(String orderNo) {
		return orderheader.isExists(orderNo);
	}

	public OrderHeadReport getOrderHeadReport(String orderId) {
		return orderheader.selectOrderHeadReportByPrimaryKey(orderId);		
	}
}