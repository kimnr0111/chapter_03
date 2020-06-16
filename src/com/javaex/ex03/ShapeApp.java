package com.javaex.ex03;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Rectangle 틀만들어 테스트
		//draw() 만들기
		//Rectangle 배열로 관리
		
		//사각형관리
		Rectangle[] rArray = new Rectangle[3];
		Rectangle r01 = new Rectangle("빨강", "검정", 5, 5);
		Rectangle r02 = new Rectangle("노랑", "노랑", 100, 20);
		Rectangle r03 = new Rectangle("파랑", "파랑", 10, 5);
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for(int i=0;i<rArray.length;i++) {
			rArray[i].draw();
		}
		System.out.println("========================================");
		//원관리
		Circle[] cArray = new Circle[3];
		Circle c01 = new Circle("빨강", "검정", 10);
		Circle c02 = new Circle("노랑", "노랑", 20);
		Circle c03 = new Circle("파랑", "파랑", 15);
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i=0;i<cArray.length;i++) {
			cArray[i].draw();
		}
		System.out.println("========================================");
		//삼각형관리
		Triangle[] tArray = new Triangle[3];
		Triangle t01 = new Triangle("빨강", "검정", 5, 5);
		Triangle t02 = new Triangle("노랑", "노랑", 100, 20);
		Triangle t03 = new Triangle("파랑", "파랑", 10, 5);
		
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		for(int i=0;i<tArray.length;i++) {
			tArray[i].draw();
		}
		
	}

}
