package com.person;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p = new Person(null, null);
//		Staff sf = new Staff(sdfsaf,234.3);
		p.getAddress();
		Student std = new Student(null, null, null, 0, 0);
		std.getFee();
		System.out.println(p.Address + std.fee);
	}
}
