package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.BybService;
import com.service.UserService;
import com.util.ApplicationContextUtil;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 先不考虑，先使用传统方法来调用
		//UserService的sayHello方法
		
		/*UserService userService = new UserService();
		userService.setName("申恒恒");
		userService.sayHello();*/
		
		//我们现在使用Spring来完成上面的任务
		//1. 引入Spring的开发包（最小配置：Spring.jar钙包啊常用的包包括了
		// 还有common-logging.jar包）
		
		//2. 创建Spring的核心文件，applicationContext.xml
		// 该文件一般放在src文件夹下
		
		//3. 配置bean
		
		//4. 调用
		
	    // 5. 得到spring的applicationContext.xml
		//ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//UserService us = (UserService) ac.getBean("userService");
		//us.sayHello();
		
		((UserService) ApplicationContextUtil.getApplicationContext()
				.getBean("userService")).sayHello();
		
				
		// 容器：这里体现出配置和注入bean的概念
		//使用spring框架就没有new对象了
		
		//ac代表了这个容器->applicationCOntext.xml
		//BybService bybService = (BybService) ac.getBean("bybService");
		//bybService.sayBye();
		
		
		
	}

}
