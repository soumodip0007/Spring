package com.spring.autowiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowiring/configAutowiring.xml");
        Employee empOne = context.getBean("empOne", Employee.class);
        System.out.println(empOne);
	}
}
