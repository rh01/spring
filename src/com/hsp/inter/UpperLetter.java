package com.hsp.inter;

public class UpperLetter implements ChangeLetter {

	private String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String change() {
		// TODO Auto-generated method stub
		// °ÉĞ¡Ğ´×ÖÄ¸×ª»»Îª´óĞ´×ÖÄ¸
		return str.toUpperCase();

	}

}
