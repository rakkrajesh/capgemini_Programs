package com.rajesh.collections.hashmapemployee;

public class Employee 
{
	private int empId;
	private String empName;
	private double empSal;
	private int empAge;
	private String empDept;
	private String empDesig;
	
	public Employee(int empId, String empName, double empSal, int empAge, String empDept, String empDesig) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empAge = empAge;
		this.empDept = empDept;
		this.empDesig = empDesig;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpDesig() {
		return empDesig;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	@Override
	public String toString() {
		return "   Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAge=" + empAge
				+ ", empDept=" + empDept + ", empDesig=" + empDesig + "]" + "\n";
	}
	
	


}
