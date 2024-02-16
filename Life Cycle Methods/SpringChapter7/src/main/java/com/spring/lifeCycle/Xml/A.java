package com.spring.lifeCycle.Xml;

	public class A {
	   private double tax;
	
	public double getTax() {
		return tax;
	}
	
	public void setTax(double tax) {
		System.out.println("Setting property");
		this.tax = tax;
	}

	public A() {
		super();
		
	}

	@Override
	public String toString() {
		return "A [tax=" + tax + "]";
	}
	
	public void init() {
		System.out.println("I am in init()");
	}
	
	public void destroy() {
		System.out.println("I am in destroy()");
	}
	
//	public void ini() {
//	System.out.println("I am in init()");
//    }
//
//	public void dest() {
//		System.out.println("I am in destroy()");
//	}
}
