package com.person;

public class Student extends Person
{
	String Program;
	int Year;
	double fee;
	public Student(String Name, String Address, String program, int year, double fee) {
		super(Name, Address);
		Program = program;
		Year = year;
		this.fee = fee;
	}
	public String getProgram() {
		return Program;
	}
	public void setProgram(String program) {
		Program = program;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [Program=" + Program + ", Year=" + Year + ", fee=" + fee + "]";
	}
	
	
}
