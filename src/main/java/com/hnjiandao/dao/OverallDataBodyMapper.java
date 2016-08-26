package com.hnjiandao.dao;

import java.util.List;

import com.hnjiandao.domain.OverallDataBody;
import com.hnjiandao.domain.OverallDataBodyReport;


public interface OverallDataBodyMapper {

	int deleteByPrimaryKey(String id);

	int deleteByOrderId(String headId);

	int insert(OverallDataBody record);

	int insertSelective(OverallDataBody record);

	OverallDataBody selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(OverallDataBody record);

	int updateByPrimaryKey(OverallDataBody record);
	
	List<OverallDataBodyReport> selectOverallDataBodyReportByOrderId(String orderId);
}