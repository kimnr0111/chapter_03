package com.javaex.ex08;

import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {
		
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		try {
			result = 100/num;
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println(e.toString());
			System.out.println("0이외의 숫자를 입력해주세요.");
		}
		finally {
			System.out.println("finally 영역");
		}
		
		sc.close();

	}

}
