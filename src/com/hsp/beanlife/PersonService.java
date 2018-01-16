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
		System.out.println("PersonService被构造");
	}
	
	public PersonService() {
		// TODO Auto-generated constructor stub
		System.out.println("PersonService被构造");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName(String name)开始");
		this.name = name;
	}
	
	public void sayHi(){
		System.out.println("Hi " + name);
	}

	// 该方法可以给arg0表示正在被实例化的bean	的id
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("正在被实例化的beanName的id为 " + arg0);		
	}

	// 该方法可以传递bean工厂
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory" + arg0);
		
	}
	
	//我自己的init方法
	// 也可以通过注解的方式来决定配置哪一个方法
	@PostConstruct
	public void init(){
		System.out.println("我自己的init方法");
	}

	// 该方法给你传递一个ApplicationContext
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
		System.out.println("destroy销毁");
		
	}*/
	
	//定制我们的销毁方法
	@PreDestroy
	public void myDestory(){
		System.out.println("destroy销毁");
		
	}
}
