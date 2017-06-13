package com.ld.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ld.dao.ResourceMapper;
import com.ld.entity.MutipleTreeNode;
import com.ld.entity.Resource;

@Service
public class ResourceServiceImp implements ResourceService{
	@Autowired
	private ResourceMapper resourceDao;
	
	public List<Resource> findResourceByUserId(int id) {
		return resourceDao.FindResourceByUserId(id);
	}

	public MenueService findMenueByUserId(int id) {
		List<Resource> resources = resourceDao.FindResourceByUserId(id);
		MenueService menues = new MenueService();
		for (Resource resource : resources) {
			MutipleTreeNode node = new MutipleTreeNode(resource, resource.getId(), resource.getParentId());
			menues.insert(node);
		}	
		return menues;
	}

	public Set<String> findPermissionByUserId(int id) {
		Set<String> permissions = new HashSet<String>();
		List<Resource> resources = findResourceByUserId(id);
		for (Resource resource : resources) {
			if(resource.getPermission().equals("") == false){
				permissions.add(resource.getPermission());
			}
		}
		return permissions;
	}

}
