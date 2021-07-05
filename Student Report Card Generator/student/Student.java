package com.wipro.student;

public class Student {
	public int studentID;
	public String studentName;
	public String departmentName;
	public int semesterNo;
	
	
	public Student(int studentID, String studentName, String departmentName, int semesterNo) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.departmentName = departmentName;
		this.semesterNo = semesterNo;
	}
	
	public void display() {
		System.out.println("Student ID: " +studentID);
		System.out.println("Name of the student: " +studentName);
		System.out.println("Department Name: " +departmentName);
		System.out.println("Semester Number: " +semesterNo);
	}
}
