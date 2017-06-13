package com.ld.dao;

import java.util.List;
import java.util.Set;

import com.ld.entity.Role;

public interface RoleMapper {
	public List<Role> FindRolesByUserName(String name);
}
