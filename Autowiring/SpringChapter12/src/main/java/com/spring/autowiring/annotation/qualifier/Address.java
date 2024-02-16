package com.spring.autowiring.annotation.qualifier;

public class Address {
    private String streetName;
    private String city;
    private int pin;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", pin=" + pin + "]";
	}
}
