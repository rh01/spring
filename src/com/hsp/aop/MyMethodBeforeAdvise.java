package com.hsp.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvise implements MethodBeforeAdvice {

	// method�����õķ���  args�����ݵĲ�����target������Ķ���
	// �ö�����Ҫдֻ��Ҫ����
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("��¼��־...." + method.getName());

	}

}
