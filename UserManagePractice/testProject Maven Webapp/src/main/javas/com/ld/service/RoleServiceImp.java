package com.ld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ld.dao.RoleMapper;
import com.ld.entity.Role;

@Service
public class RoleServiceImp implements RoleService{
	
	@Autowired
	private RoleMapper roleMapper;
	
	public List<Role> findRolesByUserName(String name) {
		return roleMapper.FindRolesByUserName(name);
	}

}
