package com.spring.lifeCycle.Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class A{
	   private String a;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public A() {
		super();
	}

	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
    
	@PostConstruct
	public void run() {
		System.out.println("I,m in init() Annotation");
	}
	
	@PreDestroy
	public void terminate() {
		System.out.println("I,m in destroy() Annotation");
	}
}
