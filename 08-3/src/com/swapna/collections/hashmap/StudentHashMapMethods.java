package com.swapna.collections.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

public class StudentHashMapMethods {
	HashMap<Integer, Student> stdDetails = null;

	public StudentHashMapMethods() {
		stdDetails = new HashMap<Integer, Student>();
		Student s = new Student(123, "Rama", 55);
		Student s1 = new Student(124, "Raja", 65);
		Student s2 = new Student(125, "Rana", 75);
		Student s3 = new Student(126, "Rani", 85);
		Student s4 = new Student(127, "Rathode", 95);
		Student s5 = new Student(128, "Ramya", 45);

		stdDetails.put(1, s);
		stdDetails.put(2, s5);
		stdDetails.put(3, s3);
		stdDetails.put(4, s2);
		stdDetails.put(5, s1);
		stdDetails.put(6, s4);
	}
	Collection<Student> stdObjects = null;
	public void averageOfStudentMarks() {
		stdObjects = stdDetails.values();
		
		System.out.println(stdObjects);
		float sum = 0.0f;
		for(Student std : stdObjects) {
			sum = sum + std.getStdMarks();
		}
		float std_avg = sum/stdObjects.size();
		System.out.println("Averagge of students in HashMap = " + std_avg);
	}


public void highestOfStudentMarks() {
	TreeSet<Float> stdMarks = new TreeSet<Float>();
	for(Student std : stdObjects) {
		stdMarks.add(std.getStdMarks());
	}
	
	System.out.println("Highest Marks = " + stdMarks.last());
}

public void sortingStudentNames() {
	System.out.println("Student Names in Sorting Order.......");
	TreeSet<String> stdNames = new TreeSet<String>();
	for(Student std : stdObjects) {
		stdNames.add(std.getStdName());
	}
	for(String stdName : stdNames) {
		System.out.println(stdName);
	}

}
}