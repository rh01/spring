package com.hsp.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/autowire/beans.xml");
		
		Master master = (Master) ac.getBean("master");
		System.out.println(master.getName()+" Ñø "+master.getDog().getName());
	}
}
