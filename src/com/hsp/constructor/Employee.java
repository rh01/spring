package com.hsp.constructor;

public class Employee {

	private String name;
	private int age;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int age) {
		System.out.println("Employee(String name, int age)被调用");
		this.name = name;
		this.age = age;
	}
	public Employee(String name) {
		System.out.println("Employee(String name)被调用");
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
