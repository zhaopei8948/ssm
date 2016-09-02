package com.hnjiandao.service;

import java.util.List;

import com.hnjiandao.domain.Role;

public interface RoleService {
	int insertSelective(Role role);
	
	int deleteByPrimaryKey(String id);
	
	List<Role> selectAll();
	
	Role selectByPrimaryKey(String id);
}
