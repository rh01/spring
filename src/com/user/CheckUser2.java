package com.user;

public class CheckUser2 implements ValidateUser {

	private String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String check() {
		// TODO Auto-generated method stub
		return str;
	}

}
