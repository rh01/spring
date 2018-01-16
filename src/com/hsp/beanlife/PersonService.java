package com.hsp.beanlife;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.security.auth.Destroyable;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisherAware;

public class PersonService implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean {

	private String name;
	private Integer age;
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public PersonService(String abc) {
		// TODO Auto-generated constructor stub
		System.out.println("PersonService������");
	}
	
	public PersonService() {
		// TODO Auto-generated constructor stub
		System.out.println("PersonService������");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName(String name)��ʼ");
		this.name = name;
	}
	
	public void sayHi(){
		System.out.println("Hi " + name);
	}

	// �÷������Ը�arg0��ʾ���ڱ�ʵ������bean	��id
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("���ڱ�ʵ������beanName��idΪ " + arg0);		
	}

	// �÷������Դ���bean����
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory" + arg0);
		
	}
	
	//���Լ���init����
	// Ҳ����ͨ��ע��ķ�ʽ������������һ������
	@PostConstruct
	public void init(){
		System.out.println("���Լ���init����");
	}

	// �÷������㴫��һ��ApplicationContext
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setApplicationContext" + arg0);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet");
	}

	/*@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy����");
		
	}*/
	
	//�������ǵ����ٷ���
	@PreDestroy
	public void myDestory(){
		System.out.println("destroy����");
		
	}
}
