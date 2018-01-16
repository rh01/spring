package com.hsp.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsp.beanlife.PersonService;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/inherit/beans.xml");
		
		Gradate gd = (Gradate) ac.getBean("gradate");
		System.out.println("name: " + gd.getName() + ",age: " + gd.getAge() + ",degree: " + gd.getDegree());

	}

}
