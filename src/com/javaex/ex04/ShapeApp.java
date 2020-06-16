package com.javaex.ex04;

import java.util.Scanner;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Rectangle 틀만들어 테스트
		//draw() 만들기
		//Rectangle 배열로 관리
		Scanner sc = new Scanner(System.in);
		Shape[] sArray = new Shape[9];
		
		String fcolor, lcolor;
		int width, height, radius;
		
		System.out.print("면색:");
		fcolor = sc.next();
		System.out.print("선색:");
		lcolor = sc.next();
		System.out.print("가로:");
		width = sc.nextInt();
		System.out.print("세로:");
		height = sc.nextInt();
		
		sArray[0] = new Rectangle(fcolor, lcolor, width, height);
		//사각형관리
		sArray[1] = new Rectangle("노랑", "노랑", 100, 20);
		sArray[2] = new Rectangle("파랑", "파랑", 10, 5);
		//원관리
		sArray[3] = new Circle("빨강", "검정", 10);
		sArray[4] = new Circle("노랑", "노랑", 20);
		sArray[5] = new Circle("파랑", "파랑", 15);
		//삼각형관리
		sArray[6] = new Triangle("빨강", "검정", 5, 5);
		sArray[7] = new Triangle("노랑", "노랑", 100, 20);
		sArray[8] = new Triangle("파랑", "파랑", 10, 5);
		
		
		for(int i=0;i<sArray.length;i++) {
			sArray[i].draw();
		}
	}

}
