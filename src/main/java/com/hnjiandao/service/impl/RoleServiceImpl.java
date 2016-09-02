package com.hnjiandao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnjiandao.dao.RoleMapper;
import com.hnjiandao.domain.Role;
import com.hnjiandao.service.RoleService;
@Service("roleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleMapper roleMapper;
	
	public int insertSelective(Role role) {
		return this.roleMapper.insertSelective(role);
	}

	public Role selectByPrimaryKey(String id) {
		return this.roleMapper.selectByPrimaryKey(id);
	}

	public List<Role> selectAll() {
		return this.roleMapper.selectAll();
	}

	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return this.roleMapper.deleteByPrimaryKey(id);
	}

}
