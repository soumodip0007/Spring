package com.spring.constructorInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/constructorInjection/configCI.xml");
        Employee e = (Employee) context.getBean("employee");
        System.out.println(e);
	}
}
