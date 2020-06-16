package com.javaex.ex01;

public class Person {
	
	private String name;
	private int age;
	private String schoolName;
	
	public Person() {}
	public Person(String name, int age, String schoolName) {
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSchoolName() {
		return name;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	public void showInfo() {
		System.out.println(name + age + schoolName);
	}

}
