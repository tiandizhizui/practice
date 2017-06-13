package com.ld.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ld.entity.PageForm;
import com.ld.entity.User;

public interface UserMapper {
	public User FindUserByName(String name);
	public List<User> FindUserByLimite(Map paramMap);
	public int getUserTotalnumber();
}
