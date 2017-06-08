package com.ld.dao;

import java.util.List;

import com.ld.entity.Resource;

public interface ResourceDao {
	public List<Resource> FindResourceByUserId(int id);
}
