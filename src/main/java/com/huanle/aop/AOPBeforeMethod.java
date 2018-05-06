package com.huanle.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class AOPBeforeMethod implements MethodBeforeAdvice {

//	method:被组合前的类(PrinterService)中具体是哪个method被调用
//	args:该method有哪些参数 
//	target:被组合前的类(PrinterService)
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("AOPBeforeMethod : Before method call.");
		System.out.println("method info:" + method.getName() + " " + method.getModifiers());
		System.out.println("argument info:");
		for (Object arg : args)
			System.out.println(arg);
		System.out.println("target Object:" + target);
		System.out.println("target object class name: " + target.getClass().getName());
	}
}