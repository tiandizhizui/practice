package com.ld.service;

import java.util.ArrayList;
import java.util.List;

import com.ld.entity.MutipleTreeNode;

public class MenueService {
private List<MutipleTreeNode> list;
  	
  	public MenueService(){
  		list = new ArrayList<MutipleTreeNode>();
  	}
  	
  	public boolean insert(MutipleTreeNode node){
  		boolean flag = false;
  		if(node.getParentId() == 0){
  			list.add(node);
  		}
  		else{
  			for(int i = 0;i < list.size();i++){
  				MutipleTreeNode thisNode = list.get(i);
  				flag = thisNode.insert(node);
  				if(flag == true){
  					break;
  				}
  			}
  		}
  		return flag;
  	}
  	
  	public boolean delete(int deleteId){
  		boolean flag = false;
  		for(int i = 0;i < list.size();i++){
  			MutipleTreeNode node = list.get(i);
  			if(node.getSefId() == deleteId){
  				list.remove(i);
  				flag = true;
  			}
  			else{
  				flag = node.deleteNodeById(deleteId);
  			}
  		}
  		return flag;
  	}
  	
  	public void visite(){
  
  	}

	public List<MutipleTreeNode> getList() {
		return list;
	}

	public void setList(List<MutipleTreeNode> list) {
		this.list = list;
	}
  	
  	
}
