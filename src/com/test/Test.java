package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.BybService;
import com.service.UserService;
import com.util.ApplicationContextUtil;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �Ȳ����ǣ���ʹ�ô�ͳ����������
		//UserService��sayHello����
		
		/*UserService userService = new UserService();
		userService.setName("����");
		userService.sayHello();*/
		
		//��������ʹ��Spring��������������
		//1. ����Spring�Ŀ���������С���ã�Spring.jar�ư������õİ�������
		// ����common-logging.jar����
		
		//2. ����Spring�ĺ����ļ���applicationContext.xml
		// ���ļ�һ�����src�ļ�����
		
		//3. ����bean
		
		//4. ����
		
	    // 5. �õ�spring��applicationContext.xml
		//ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//UserService us = (UserService) ac.getBean("userService");
		//us.sayHello();
		
		((UserService) ApplicationContextUtil.getApplicationContext()
				.getBean("userService")).sayHello();
		
				
		// �������������ֳ����ú�ע��bean�ĸ���
		//ʹ��spring��ܾ�û��new������
		
		//ac�������������->applicationCOntext.xml
		//BybService bybService = (BybService) ac.getBean("bybService");
		//bybService.sayBye();
		
		
		
	}

}
