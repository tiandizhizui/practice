package com.ld.dao;

import com.ld.entity.User;

public interface UserDao {
	public User findUserByName(String name);
	
}
