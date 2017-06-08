package com.ld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ld.dao.UserMapper;
import com.ld.entity.User;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserMapper userdao;
	
	public User findUserByName(String name) {
		User user = userdao.FindUserByName(name);
		return user;
	}

}
