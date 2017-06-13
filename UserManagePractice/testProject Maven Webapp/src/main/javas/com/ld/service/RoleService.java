package com.ld.service;

import java.util.Set;

import com.ld.entity.Role;

public interface RoleService {
	public Set<String> findRolesByUserName(String name);
}
