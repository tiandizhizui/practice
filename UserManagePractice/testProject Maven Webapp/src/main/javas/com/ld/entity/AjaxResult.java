package com.ld.entity;

public class AjaxResult {
	private boolean result;
	private String message;
	
	public AjaxResult(boolean result,String message){
		this.result = result;
		this.message = message;
	}
	
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
