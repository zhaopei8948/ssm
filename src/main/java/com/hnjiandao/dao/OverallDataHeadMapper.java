package com.hnjiandao.dao;

import com.hnjiandao.domain.OrderHeadReport;
import com.hnjiandao.domain.OverallDataHead;

public interface OverallDataHeadMapper {

	String getOrderId(String orderNo);

	int isExists(String orderNo);

	int updateByOrderNoSelective(OverallDataHead record);

	int deleteByPrimaryKey(String id);

	int insert(OverallDataHead record);

	int insertSelective(OverallDataHead record);

	OverallDataHead selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(OverallDataHead record);

	int updateByPrimaryKey(OverallDataHead record);
	
	OrderHeadReport selectOrderHeadReportByPrimaryKey(String orderId);
}