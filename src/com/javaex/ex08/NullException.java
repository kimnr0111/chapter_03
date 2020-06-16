package com.javaex.ex08;

public class NullException {

	public static void main(String[] args) {
		
		String str= new String("안녕하세요");
		str = null;

		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("참조값(주소)이 없습니다.");
		}
	}

}
