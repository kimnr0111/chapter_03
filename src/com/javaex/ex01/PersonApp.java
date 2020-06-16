package com.javaex.ex01;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p1 = new Person("정우성", 45, "학교");
		
		String msg = p1.toString();
		System.out.println(msg);
		
		p1.showInfo();

	}

}
