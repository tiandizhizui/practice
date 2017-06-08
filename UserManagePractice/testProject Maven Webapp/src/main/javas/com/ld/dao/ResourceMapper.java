package com.ld.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ld.entity.Resource;

public interface ResourceMapper {
	public List<Resource> FindResourceByUserId(int id);
}
