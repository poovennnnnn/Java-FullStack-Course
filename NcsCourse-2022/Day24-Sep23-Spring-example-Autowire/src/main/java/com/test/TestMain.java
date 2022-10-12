package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Autowire-byConstructorBeans.xml");
//		B b1 = ctx.getBean(B.class);
//		C c1 = ctx.getBean(C.class);
		B b1 = (B) ctx.getBean("b1");
		C c1 = (C) ctx.getBean("c1");
		
		b1.bMethod();
		b1.getA1().aMethod();
		b1.getD1().cMethod();
//		c1.cMethod();
//		c1.getA1().aMethod();
		
	}

}
