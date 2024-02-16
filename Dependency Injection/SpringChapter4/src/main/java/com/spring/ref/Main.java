package com.spring.ref;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ref/configRef.xml");
		ReferenceOne referenceOneRef = (ReferenceOne) context.getBean("aref");
        
		System.out.println(referenceOneRef.getA());
		System.out.println(referenceOneRef.getObj().getB());
		
		System.out.println(referenceOneRef);
	}
}
