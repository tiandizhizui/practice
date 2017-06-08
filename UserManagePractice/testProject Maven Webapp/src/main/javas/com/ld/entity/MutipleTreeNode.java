package com.ld.entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MutipleTreeNode {
	private int parentId;
	private int sefId;
	private Object obj;
	private List<MutipleTreeNode> childList;
	private MutipleTreeNode parentNode;
	
	public MutipleTreeNode(){
		initChildList();
	}
	
	public MutipleTreeNode(Object obj,int sefId,int parentId){
		initChildList();
		this.obj = obj;
		this.sefId = sefId;
		this.parentId = parentId;
	}
	
	public MutipleTreeNode(int sefId){
		initChildList();
		this.sefId = sefId;
	}
	
	public MutipleTreeNode(int selfId,MutipleTreeNode parentNode){
		initChildList();
		this.sefId = selfId;
		this.parentNode = parentNode;
	}
	
	public MutipleTreeNode(MutipleTreeNode parentNode){
		initChildList();
		this.parentNode = parentNode;
	}
	
	private void initChildList(){
		childList = new ArrayList<MutipleTreeNode>();
	}
	
	public void addChildNode(MutipleTreeNode node){
		if(childList == null){
			initChildList();
		}
		childList.add(node);
	}
	
	/*返回当前节点父辈集合*/
	public List<MutipleTreeNode> getElders(){
		List<MutipleTreeNode> EldersList = new ArrayList<MutipleTreeNode>();
		MutipleTreeNode parentNode = getParentNode();
		if(parentNode == null){
			return EldersList;
		}
		else{
			EldersList.add(parentNode);
			EldersList.addAll(parentNode.getElders());
		}
		return EldersList;
	}
	
	/*返回当前节点的所有晚辈集合*/
	public List<MutipleTreeNode> getJuniors(){
		List<MutipleTreeNode> juniorsList = new ArrayList<MutipleTreeNode>();
		if(childList.isEmpty()){
			return juniorsList;
		}
		else{
			for(int i = 0;i < childList.size();i++){
				juniorsList.add(childList.get(i));
				juniorsList.addAll(childList.get(i).getJuniors());
			}
		}
		return juniorsList;
	}
	
	/*删除当前节点的某个子节点*/
	private boolean deleteChildNode(int childId){
		boolean flag = false;
		if(childList.isEmpty() == false){
			for(int i = 0;i < childList.size();i++){
				if(childList.get(i).getSefId() == childId){
					childList.remove(i);
					flag = true;
					break;
				}
			}
		}
		return flag;
	}
	
	/*删除节点的某结点,头结点除外*/
	private boolean deleteNode(){
		boolean flag = false;
		if(parentNode != null){
			flag = parentNode.deleteChildNode(sefId);
		}
		return flag;
	}
	
	public boolean deleteNodeById(int id){
		boolean flag = false;
		MutipleTreeNode node = findNodeById(id);
		if(node != null){
			node.deleteNode();
			flag = true;
		}
		return flag;
	}
	
	private MutipleTreeNode findNodeById(int id){
		MutipleTreeNode node = null;
		if(id == sefId){
			node = this;
		}
		else{
			for(int i = 0;i < childList.size();i++){
				node = childList.get(i).findNodeById(id);
			}
		}
		return node;
	}
	
	/*层次遍历一棵树*/
	public void LeveVisite(){
		Queue<MutipleTreeNode> queue = new LinkedList<MutipleTreeNode>();
		System.out.println(sefId + " | " + obj );
		for(int i = 0;i < childList.size();i++){
			queue.add(childList.get(i));
		}
		while(queue.isEmpty() == false){
			MutipleTreeNode node = queue.poll();
			for(int i = 0;i < node.childList.size();i++){
				queue.add(node.childList.get(i));
			}
			System.out.println(node.getSefId() + " | " + node.obj);
			
		}
	}
	
	/*动态插入节点*/
	public boolean insert(MutipleTreeNode node){
		boolean flag = false;
		if(node.parentId == this.sefId){
			addChildNode(node);
			return true;
		}
		else{
			for(int i = 0;i < childList.size();i++){
				flag = childList.get(i).insert(node);
				if(flag == true){
					break;
				}
			}
		}
		return flag;
	}
	
	public MutipleTreeNode getParentNode() {
		return parentNode;
	}
	public void setParentNode(MutipleTreeNode parentNode) {
		this.parentNode = parentNode;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getSefId() {
		return sefId;
	}
	public void setSefId(int sefId) {
		this.sefId = sefId;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public List<MutipleTreeNode> getChildList() {
		return childList;
	}
	public void setChildList(List<MutipleTreeNode> childList) {
		this.childList = childList;
	}
}
