package com.spring.constructorInjection;

public class Course {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
