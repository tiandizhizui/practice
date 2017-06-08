package com.ld.dao;

import com.ld.entity.User;

public interface UserMapper {
	public User FindUserByName(String name);
}
