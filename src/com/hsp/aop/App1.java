package com.hsp.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/aop/beans.xml");
		
		//��ͳ�ķ��� aop����������
		//Test1Service ts = (Test1Service) ac.getBean("test1Service");
		//ts.sayHell();
		
		//���ô������
		TestServiceInter ts = (TestServiceInter) ac.getBean("proxyFactoryBean");
		ts.sayHell();
		((TestServiceInter2)ts).sayBye(); 

	}
	
}
