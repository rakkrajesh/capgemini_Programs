package com.person;

public class Person 
{
	static String Name;
	static String Address;
	
	
	public Person(String name, String address) {
		Name = name;
		Address = address;
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Address=" + Address + "]";
	}
	
	
	
}
