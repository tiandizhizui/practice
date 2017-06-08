package com.ld.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import com.ld.entity.User;

@Component
public class UserDaoImp implements UserDao{
	
	private SqlSessionFactory factory;
	private Reader reader;
	private static final String config = "mybatis/mybatis-config.xml";
	
	public UserDaoImp() throws IOException{
		reader = Resources.getResourceAsReader(config);
		factory = new SqlSessionFactoryBuilder().build(reader);
	}
	
	public User findUserByName(String name) {
		SqlSession session = null;
		User user = null;
		try{
			session = factory.openSession();
			user = (User)session.selectOne("com.ld.UserMapper.FindUserByName",name);
		}catch(Exception ex){
			System.out.println(ex);
		}
		finally{
			session.close();
		}
		return user;
	}
	
}
