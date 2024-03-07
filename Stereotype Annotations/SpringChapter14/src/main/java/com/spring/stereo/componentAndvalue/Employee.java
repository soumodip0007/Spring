package com.spring.stereo.componentAndvalue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

    @Component
	public class Employee {
       @Value("1")
	   private int id;
       @Value("Mario")
	   private String name;
       @Value("60000")
	   private int salary;
	   
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee - [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
	
}
