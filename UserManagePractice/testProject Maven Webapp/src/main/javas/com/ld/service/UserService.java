package com.ld.service;

import java.util.List;

import com.ld.entity.PageForm;
import com.ld.entity.User;

public interface UserService {
	public User findUserByName(String name);
	public List<User> findUserByLimit(int offset,int limit);
	public int getCount();
	
}
