package com.spring.ref;

public class ReferenceOne {
    private int a;
	private ReferenceTwo obj;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public ReferenceTwo getObj() {
		return obj;
	}
	public void setObj(ReferenceTwo obj) {
		this.obj = obj;
	}
	public ReferenceOne() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ReferenceOne [a=" + a + ", obj=" + obj + "]";
	}
	
}
