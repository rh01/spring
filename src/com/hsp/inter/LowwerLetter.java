package com.hsp.inter;
// Сдת��Ϊ��д��ĸ
public class LowwerLetter implements ChangeLetter {

	private String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String change() {
		return str.toLowerCase();
	}

}
