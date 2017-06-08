package com.ld.dao;

import java.util.List;

import com.ld.entity.Role;

public interface RoleMapper {
	public List<Role> FindRolesByUserName(String name);
}
