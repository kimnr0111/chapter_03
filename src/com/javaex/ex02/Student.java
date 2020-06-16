package com.javaex.ex02;

public class Student extends Person{
	
	private String schoolName;

	public Student() {
		//super();
		System.out.println("Student(0)");
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	public void showInfo() {
		System.out.println("#이름:" + super.getName() + " #나이:" + super.getAge() + " #학교:" + schoolName);
		System.out.println("stshowInfo");
	}
	
	
}
