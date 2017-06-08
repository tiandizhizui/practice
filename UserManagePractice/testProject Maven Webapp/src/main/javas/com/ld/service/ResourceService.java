package com.ld.service;

import java.util.List;

import com.ld.entity.MutipleTreeNode;
import com.ld.entity.Resource;

public interface ResourceService {
	public List<Resource> findResourceByUserId(int id);
	public MenueService findMenueByUserId(int id);
}
