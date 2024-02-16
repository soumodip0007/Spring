package com.spring.constructorInjection;
import java.util.List;

public class Employee {
   private int empId;
   private String empName;
   private Course course;
   private List<String> list;
   
   public List<String> getList() {
	    return list;
   }

   public void setList(List<String> list) {
		this.list = list;
   }

   public Employee(int empId, String empName, Course course, List<String> list) {
	   this.empId = empId;
	   this.empName = empName;
	   this.course = course;
	   this.list = list;
   }

	@Override
	public String toString() {
		return this.empId + " - " +this.empName + " - " +this.course + " - " + this.list;
	}
}
