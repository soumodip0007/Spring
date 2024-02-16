package com.spring.lifeCycle.SpringInterfaces;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class A implements InitializingBean, DisposableBean{
	   private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public A() {
		super();
	}

	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}

	public void afterPropertiesSet() throws Exception {
		//init()
		System.out.println("I'm in init()");
	}

	public void destroy() throws Exception {
		// destroy()
		System.out.println("I'm in destroy()");
	}  
}
