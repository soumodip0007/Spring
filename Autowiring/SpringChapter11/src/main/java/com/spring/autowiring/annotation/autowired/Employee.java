package com.spring.autowiring.annotation.autowired;
import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	@Autowired
    private Address address;

	public Address getAddress() {
		return address;
	}
    
	
	public void setAddress(Address address) {
		System.out.println("setter");
		this.address = address;
	}

	public Employee() {
		super();
	}
    
	
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("constructor");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}

