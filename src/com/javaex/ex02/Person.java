package com.javaex.ex02;

public class Person{
	
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person(0)");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
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
	
	public void showInfo() {
	}


}
