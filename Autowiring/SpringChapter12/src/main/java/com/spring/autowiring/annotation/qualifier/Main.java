package com.spring.autowiring.annotation.qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowiring/annotation/qualifier/configAutowiringAnnotation.xml");
        Employee empOne = context.getBean("empOne", Employee.class);
        System.out.println(empOne);
	}
}
