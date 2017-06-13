package com.ld.service;
import java.util.List;
import java.util.Set;

import com.ld.entity.Resource;

public interface ResourceService {
	public List<Resource> findResourceByUserId(int id);
	public MenueService findMenueByUserId(int id);
	public Set<String> findPermissionByUserId(int id);
}
