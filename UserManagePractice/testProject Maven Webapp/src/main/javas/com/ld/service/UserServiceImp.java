package com.ld.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ld.dao.UserMapper;
import com.ld.entity.PageForm;
import com.ld.entity.User;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserMapper userdao;
	
	public User findUserByName(String name) {
		User user = userdao.FindUserByName(name);
		return user;
	}

	public List<User> findUserByLimit(int offset,int limit) {
		Map<String, Integer> paramMap = new HashMap<String, Integer>();
		paramMap.put("offset", offset);
		paramMap.put("limit", limit);
		List<User> users = userdao.FindUserByLimite(paramMap);
		return users;
	}

	public int getCount() {
		return userdao.getUserTotalnumber();
	}

}
