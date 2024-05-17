package com.javatest;

import java.util.ArrayList;
import java.util.List;

public class Student {
//This is test
	private int a =1;
	private int rollNumber;
	private String studentName;
	private String branch;
	private int semester;

	public Student(int rollNumber, String studentName, String branch, int semester) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.branch = branch;
		this.semester = semester;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(300245, "Harsh", "Computer Science", 3));
		studentList.add(new Student(102, "Gopi", "Electrical enginnering", 1));
		studentList.add(new Student(300246, "Kiran", "Electrical enginnering", 3));
		studentList.add(new Student(103, "Rashi", "Chemical Engineering", 2));
		studentList.add(new Student(30054, "Suraj", "Electrical enginnering", 3));
		// Displayed all the student data
		studentList.forEach(dataofstudent -> System.out
				.println(dataofstudent.getRollNumber() + ": " + " " + dataofstudent.getStudentName() + " is from "
						+ dataofstudent.getSemester() + " semester " + " and branch is " + dataofstudent.getBranch()));

		// Filter out third semester data

		System.out.println("*********************Displaying data from 3rd semester****************");
		System.out.println("***********************************************************************");

		for (Student dataofstudent : studentList) {

			if (dataofstudent.getSemester() == 3) {

				System.out.println(dataofstudent.getRollNumber() + ": " + " " + dataofstudent.getStudentName()
						+ " is from " + dataofstudent.getSemester() + " semester " + " and branch is "
						+ dataofstudent.getBranch());

			}

		}

	}

}
