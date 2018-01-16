package com.service;

public class UserService {
	
	private String name;
	
	public BybService getByeService() {
		return byeService;
	}

	public void setByeService(BybService byeService) {
		this.byeService = byeService;
	}

	private BybService byeService;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("Hello " + name);
		byeService.sayBye();
	}
	

	

}
