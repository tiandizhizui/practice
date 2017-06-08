package com.ld.dao;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ld.entity.Resource;

@Component
public class ResourceDaoImp implements ResourceDao{
	
	@Autowired
	private SqlSessionFactory factory;
	
	public List<Resource> FindResourceByUserId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
