package com.hsp.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App1 {
	
	public static void main(String[] args) {
		// �������Ļ�ȡ����·��
	    //ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/ioc/beans.xml");
	    
		// ͨ���ļ�·����ȡ
		// ����·��
		ApplicationContext ac = new FileSystemXmlApplicationContext("F:\\06_workshop\\myspring\\src\\com\\hsp\\ioc\\beans.xml");
		
		//Student stu1 = (Student) ac.getBean("student");
		//Student stu2 = (Student) ac.getBean("student");
		
		//System.out.println(stu1 + " " +  stu2);
		// ������ʵ�������beans.xml����ô���beans.xml��bean�ᱻʵ����(��bean scope�� singleton)
		// ȱ���������ڴ棬���Ǽ��ؿ�
		
		//   ��bean������ȡ��student
		/*BeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("com/hsp/ioc/beans.xml")
				);
		
		factory.getBean("student");*/
		// �������ʹ��bean�������������ʵ��������������ô������bean����ʵ������ֻ�е���ȥʹ��ĳ��bean���Ż����ԵĴ���
		// �ƶ��豸�����Խ�ʡ�ڴ棬������Ƚ�����
		// һ�������ʹ��������
	}

}
