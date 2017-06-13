package com.ld.entity;

public class PageForm {
	private int limit;
	private int offset;
	public PageForm(){
		
	}
	public PageForm(int offset, int limit) {
		this.limit = limit;
		this.offset = offset;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	
}
