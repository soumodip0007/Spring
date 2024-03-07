package com.spring.stereo.componentAndvalueInjectingCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stereo/componentAndvalueInjectingCollection/configStereo.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
        System.out.println(employee.getPhoneNumber());
        System.out.println(employee.getPhoneNumber().getClass().getName());
	}
}
