package com.hsp.aop;

public class Test1Service implements TestServiceInter,TestServiceInter2 {

	private String name;
	
	@Override
	public void sayHell() {
		// TODO Auto-generated method stub
		System.out.println("Hello " + name);

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("Bye " + name);
		int i = 9/0;
		
	}

}
