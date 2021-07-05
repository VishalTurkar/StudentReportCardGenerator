package com.wipro.studentReportCard;
import com.wipro.student.Student;

public class StudentReportCard extends Student{
	
	public int total_subjects;
	public int points_earned;
	public float gpa;
	public float cgpa;
	
	public StudentReportCard(int studentID, String studentName, String departmentName, int semesterNo,int total_subjects,int points_earned) {
		super(studentID, studentName, departmentName, semesterNo);
		this.total_subjects=total_subjects;
		this.points_earned=points_earned;
	}
	
	public float gpaCalculator() {
		float GPA=(float)(total_subjects*points_earned)/7;
		return GPA;
	}
	
	public float cgpaCalculator(float gpa) {
		float CGPA=(float)(gpa)/(semesterNo);
		return CGPA;
	}
	
	public void display() {
		System.out.println("Student ID: " +studentID);
		System.out.println("Name of the student: " +studentName);
		System.out.println("Department Name: " +departmentName);
		System.out.println("Semester Number: " +semesterNo);
		System.out.println("GPA Computed: " +gpaCalculator());
		System.out.println("CGPA Computed: " +cgpaCalculator(gpaCalculator()));
	}
}
