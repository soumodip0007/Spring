package com.spring.lifeCycle.SpringInterfaces;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifeCycle/SpringInterfaces/config.xml");
        A a = (A) context.getBean("a");
        System.out.println(a);
        context.registerShutdownHook(); //Enabling shutdown hook
	}
}