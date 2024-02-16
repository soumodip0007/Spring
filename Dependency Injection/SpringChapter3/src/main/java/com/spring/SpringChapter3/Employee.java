package com.spring.SpringChapter3;

public class Employee {
   private int empId;
   private String empName;
   private String empSalary;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	System.out.println("Setter injection");
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Employee(int empId, String empName, String empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
}
public String getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(String empSalary) {
	this.empSalary = empSalary;
}
public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
  }
}
