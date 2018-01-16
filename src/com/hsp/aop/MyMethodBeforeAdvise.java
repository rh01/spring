package com.hsp.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvise implements MethodBeforeAdvice {

	// method被调用的方法  args被传递的参数，target被代理的对象
	// 该对象不需要写只需要配置
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("记录日志...." + method.getName());

	}

}
