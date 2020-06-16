package com.javaex.ex02;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Person p1 = new Person("정우성", 45);
		p1.showInfo();
		
		Student s1 = new Student("서울고등학교");
		s1.showInfo();
		
		
		Student s2 = new Student("정우성", 45, "서울고등학교");
		
		Student s3 = new Student();
		
		s2.stshowInfo();
		*/
		
		Person p = new Student("정우성", 45, "서울고등학교");
		
		p.showInfo();
		//p.stshowInfo();
		
		((Student)p).setSchoolName("제주고등학교");
		
		p.showInfo();
		
	}

}
