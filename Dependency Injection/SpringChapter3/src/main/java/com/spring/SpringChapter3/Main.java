package com.spring.SpringChapter3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.collections.Employees;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collections/collectionConfig.xml");
		Employees employeeOne = (Employees) context.getBean("employeeOne");
        
		System.out.println(employeeOne.getName());
		System.out.println(employeeOne.getPhones());
		System.out.println(employeeOne.getAddresses());
		System.out.println(employeeOne.getCourses());
		System.out.println(employeeOne.getProps());
	}

}
