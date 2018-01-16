package com.hsp.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App1 {
	
	public static void main(String[] args) {
		// 从上下文获取和类路径
	    //ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/ioc/beans.xml");
	    
		// 通过文件路径获取
		// 绝对路径
		ApplicationContext ac = new FileSystemXmlApplicationContext("F:\\06_workshop\\myspring\\src\\com\\hsp\\ioc\\beans.xml");
		
		//Student stu1 = (Student) ac.getBean("student");
		//Student stu2 = (Student) ac.getBean("student");
		
		//System.out.println(stu1 + " " +  stu2);
		// 当我们实例化这个beans.xml，那么这个beans.xml的bean会被实例化(该bean scope是 singleton)
		// 缺点是消耗内存，但是加载快
		
		//   从bean工厂中取出student
		/*BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("com/hsp/ioc/beans.xml")
				);
		
		factory.getBean("student");*/
		// 如果我们使用bean工厂，当你仅仅实例化该容器，那么容器的bean不被实例化，只有当你去使用某个bean，才会试试的创建
		// 移动设备，可以节省内存，但是相比较于慢
		// 一般情况下使用上下文
	}

}
