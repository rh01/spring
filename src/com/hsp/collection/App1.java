package com.hsp.collection;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/collection/beans.xml");
		
		Department department = (Department)ac.getBean("department");
		System.out.println(department.getName());
		
		
		for(String emName:department.getEmpName()){
			System.out.println(emName);
		}
		//证明第二个事情
		
		System.out.println("****************通过list集合取出***********************");
		for(Employee e:department.getEmpList()){
			System.out.println("name = " +e.getName());
		}
		
		//证明set的设置是否正确
		System.out.println("**************通过set取出*******************************");
		for(Employee e:department.getEmpSets()){
			System.out.println("name = " + e.getName());
		}
		
		//证明map的设置是否正确
		//简洁的方法
		System.out.println("**************通过间接方式去除map里面的值取出*******************************");
		for(Entry<String, Employee> entry:department.getEmpMaps().entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue().getName() );
		}
		
		//迭代器
		System.out.println("**************通过迭代器的形式进行取出*******************************");
		Map<String, Employee> empMap =  department.getEmpMaps();
		Iterator it =empMap.keySet().iterator();
		while(it.hasNext()){
			String key = (String) it.next();
			Employee emp = empMap.get(key);
			System.out.println("key = " + key + " name = " + emp.getName());
		}
		
		System.out.println("**************通过Properties取出*******************************");
		Properties pp =department.getPp();
		System.out.println(pp.get("pp1")); //根据key来取出数据
		// 通过迭代的方式取数据
		for(Entry<Object,Object> e:pp.entrySet()){
			System.out.println(e.getKey().toString() +" " + e.getValue().toString());
		}
		
		
		Enumeration<Object> en = pp.keys();
		while(en.hasMoreElements()){
			//Entry<Object, Object> ele = (Entry<Object, Object>) en.nextElement();
			//System.out.println(ele.getKey() + " " + ele.getValue());
			String key = (String) en.nextElement();
			System.out.println(key + " " + pp.getProperty(key) );
		}
		
		
	}

}
