package com.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/user/beans.xml");
		
		// ���ýӿ�ʵ��
	    ValidateUser vu = (ValidateUser) ac.getBean("check");
	    System.out.println(vu.check());

	}

}
