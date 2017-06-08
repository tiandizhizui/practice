package com.ld.service;

import java.util.List;

import com.ld.entity.Role;

public interface RoleService {
	public List<Role> findRolesByUserName(String name);
}
