package com.javaex.ex05;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Rectangle 틀만들어 테스트 
		//draw() 만들기
		//Rectangle 배열로 관리
		
		Shape[] sArray = new Shape[9];
		
		//사각형관리
		Shape r01 = new Rectangle("빨강", "검정", 5, 5);
		Shape r02 = new Rectangle("노랑", "노랑", 100, 20);
		Shape r03 = new Rectangle("파랑", "파랑", 10, 5);
		//원관리
		Shape c01 = new Circle("빨강", "검정", 10);
		Shape c02 = new Circle("노랑", "노랑", 20);
		Shape c03 = new Circle("파랑", "파랑", 15);
		//삼각형관리
		Shape t01 = new Triangle("빨강", "검정", 5, 5);
		Shape t02 = new Triangle("노랑", "노랑", 100, 20);
		Shape t03 = new Triangle("파랑", "파랑", 10, 5);
		
		sArray[0] = r01;
		sArray[1] = r02;
		sArray[2] = r03;
		sArray[3] = c01;
		sArray[4] = c02;
		sArray[5] = c03;
		sArray[6] = t01;
		sArray[7] = t02;
		sArray[8] = t03;
		
		for(int i=0;i<sArray.length;i++) {
			sArray[i].draw();
		}
		
		System.out.println(((Rectangle)r01).getWidth());
	}

}
