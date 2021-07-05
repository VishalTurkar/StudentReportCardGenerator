package com.wipro.main;
import com.wipro.studentReportCard.StudentReportCard;
import java.util.*;

public class MainClass {

	public static void main(String abcd[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter StudentID:");
		int id=s.nextInt();
		s.nextLine();
		System.out.println("Enter Name:");
		String name=s.nextLine();
		System.out.println("Enter Semester Number:");
		int semNo=s.nextInt();
		System.out.println("Enter Total Number of Subjects:");
		int subNo=s.nextInt();
		System.out.println("Enter Points Earned:");
		int points=s.nextInt();
		s.nextLine();
		System.out.println("Enter Department:");
		String dep=s.nextLine();
		
		if(validateInputs(id,semNo,subNo,points)) {
			StudentReportCard reportObject = new StudentReportCard(id,name,dep,semNo,subNo,points);
			reportObject.display();
		}else {
			System.out.println("Invalid Request");
		}
		s.close();
	}

	public static boolean validateInputs(int studentID, int semNumber, int total_subjects, int points_earned) {
		if(Integer.toString(studentID).length()!=4)
			return false;
		if(semNumber<1 || semNumber>7)
			return false;
		if(total_subjects<1 || total_subjects>7)
			return false;
		if(points_earned<1 || points_earned>20)
			return false;
		return true;
	}
}
