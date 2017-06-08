package com.ld.entity;

import java.util.List;

public class User {
	private int id;
	private String name;
	private String realName;
	private String passWord;
	private String rolesStr;
	private List<Long> rolesid;
	private String img;
	
	public User(String name,String passWord){
		this.name = name;
		this.passWord = passWord;
	}
	
	public User(){
		
	}
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getRolesStr() {
		return rolesStr;
	}
	public void setRolesStr(String rolesStr) {
		this.rolesStr = rolesStr;
	}
	public List<Long> getRolesid() {
		return rolesid;
	}
	public void setRolesid(List<Long> rolesid) {
		this.rolesid = rolesid;
	}		
	
}
