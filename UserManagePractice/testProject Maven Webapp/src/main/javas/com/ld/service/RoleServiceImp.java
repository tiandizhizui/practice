package com.ld.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ld.dao.RoleMapper;
import com.ld.entity.Role;

@Service
public class RoleServiceImp implements RoleService{
	
	@Autowired
	private RoleMapper roleMapper;
	
	public Set<String> findRolesByUserName(String name) {
		List<Role> list = roleMapper.FindRolesByUserName(name);
		Set<String> roles = new HashSet<String>();
		for(Role role : list){
			roles.add(role.getName());
		}
		return roles;
	}

}
