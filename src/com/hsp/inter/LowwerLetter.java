package com.hsp.inter;
// 小写转换为大写字母
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
