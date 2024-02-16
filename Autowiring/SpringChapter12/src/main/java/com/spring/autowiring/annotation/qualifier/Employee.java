package com.spring.autowiring.annotation.qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("addressTwo")
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

