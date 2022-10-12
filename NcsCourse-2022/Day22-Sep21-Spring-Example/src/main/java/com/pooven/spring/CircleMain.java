package com.pooven.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircleMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("CircleBeans.xml");
		
		CircleService service1  = (CircleService) ctx.getBean("circleService1");
		CircleService service2  = (CircleService) ctx.getBean("circleService2");
		CircleService service3  = (CircleService) ctx.getBean("circleService3");
	
		service1.draw();
		service2.draw();
		service3.draw();
		
		
	}

}
