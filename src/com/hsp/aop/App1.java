package com.hsp.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/aop/beans.xml");
		
		//传统的方法 aop不发挥作用
		//Test1Service ts = (Test1Service) ac.getBean("test1Service");
		//ts.sayHell();
		
		//调用代理对象
		TestServiceInter ts = (TestServiceInter) ac.getBean("proxyFactoryBean");
		ts.sayHell();
		((TestServiceInter2)ts).sayBye(); 

	}
	
}
