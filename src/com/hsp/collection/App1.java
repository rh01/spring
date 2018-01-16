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
		//֤���ڶ�������
		
		System.out.println("****************ͨ��list����ȡ��***********************");
		for(Employee e:department.getEmpList()){
			System.out.println("name = " +e.getName());
		}
		
		//֤��set�������Ƿ���ȷ
		System.out.println("**************ͨ��setȡ��*******************************");
		for(Employee e:department.getEmpSets()){
			System.out.println("name = " + e.getName());
		}
		
		//֤��map�������Ƿ���ȷ
		//���ķ���
		System.out.println("**************ͨ����ӷ�ʽȥ��map�����ֵȡ��*******************************");
		for(Entry<String, Employee> entry:department.getEmpMaps().entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue().getName() );
		}
		
		//������
		System.out.println("**************ͨ������������ʽ����ȡ��*******************************");
		Map<String, Employee> empMap =  department.getEmpMaps();
		Iterator it =empMap.keySet().iterator();
		while(it.hasNext()){
			String key = (String) it.next();
			Employee emp = empMap.get(key);
			System.out.println("key = " + key + " name = " + emp.getName());
		}
		
		System.out.println("**************ͨ��Propertiesȡ��*******************************");
		Properties pp =department.getPp();
		System.out.println(pp.get("pp1")); //����key��ȡ������
		// ͨ�������ķ�ʽȡ����
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
