package com.spring.SpringChapter3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Employee employeeOne = (Employee) context.getBean("employeeOne");
        Employee employeeTwo = (Employee) context.getBean("employeeTwo");
        Employee employeeThree = (Employee) context.getBean("employeeThree");
        
        System.out.println(employeeOne);
        System.out.println(employeeTwo);
        System.out.println(employeeThree);
        
        //for injection using p schema
        Employee employeeFour = (Employee) context.getBean("employeeFour");
        Employee employeeFive = (Employee) context.getBean("employeeFive");
        Employee employeeSix = (Employee) context.getBean("employeeSix");
        
        System.out.println(employeeFour);
        System.out.println(employeeFive);
        System.out.println(employeeSix);
        
    }
}
