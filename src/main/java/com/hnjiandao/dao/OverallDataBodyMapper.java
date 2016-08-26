package com.hnjiandao.dao;

import com.hnjiandao.domain.OverallDataBody;

public interface OverallDataBodyMapper {

	int deleteByPrimaryKey(String id);

	int deleteByOrderId(String headId);

	int insert(OverallDataBody record);

	int insertSelective(OverallDataBody record);

	OverallDataBody selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(OverallDataBody record);

	int updateByPrimaryKey(OverallDataBody record);
}