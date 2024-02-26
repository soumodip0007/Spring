package com.spring.standaloneCollection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/standaloneCollection/configStandalone.xml");
		People peopleOne = context.getBean("peopleOne", People.class);
		System.out.println(peopleOne.getArmy());
		System.out.println(peopleOne.getArmy().getClass().getName());
		System.out.println(peopleOne.getCricketTeam());
		System.out.println(peopleOne.getCricketTeam().getClass().getName());
		System.out.println(peopleOne.getProps());
		System.out.println(peopleOne.getProps().getClass().getName());
	}

}
