package com.huanle.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huanle.aop.PrinterService;


//从结果我们可以看到AOPBeforeMethod“的before()方法在每个myService的方法之前执行。
public class MainApp {
	public static void main(String[] args) {
	    ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
	    PrinterService cust = (PrinterService) appContext.getBean("myServiceProxy");//用组合好的类代替PrinterService(扩充了PrinterService里的方法)
	    cust.printName();
	    System.out.println("******************");
	    cust.printURL();
	    System.out.println("******************");
	    try {
	      cust.printThrowException();
	    } catch (Exception e) {
	    }
	  }
}
