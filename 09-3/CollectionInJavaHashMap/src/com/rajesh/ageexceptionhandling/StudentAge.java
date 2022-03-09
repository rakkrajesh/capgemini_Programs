package com.rajesh.ageexceptionhandling;

public class StudentAge {
	private String stuName;
	private int stuAge;
	
	public StudentAge(String stuName, int stuAge) 
	{try {
		
		this.stuName = stuName;
		this.stuAge = stuAge;
		if (stuAge < 18 ) {
			throw new InvalidAgeException(" Age should be above 18 ");
		}
	}
		catch(Exception ageLimit) {
			System.out.println(stuName+ InvalidAgeException.message);
			ageLimit.printStackTrace();
		}
	}
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	
	
}
