package com.person;

public class Staff extends Person 
{	
	String School;
	double Pay;
	public Staff(String school, double pay) {
		super(Name, Address);
		School = school;
		Pay = pay;
	}
	public String getSchool() {
		return School;
	}
	public void setSchool(String school) {
		School = school;
	}
	public double getPay() {
		return Pay;
	}
	public void setPay(double pay) {
		Pay = pay;
	}
	@Override
	public String toString() {
		return "Staff [School=" + School + ", Pay=" + Pay + "]";
	}
	
	 
}
