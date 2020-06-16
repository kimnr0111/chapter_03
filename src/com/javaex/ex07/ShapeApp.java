package com.javaex.ex07;

public class ShapeApp {
	
	//필드
	//생성자
	//ShapeApp(){}

	public static void main(String[] args) {
		
		//Rectangle 틀만들어 테스트 
		//draw() 만들기
		//Rectangle 배열로 관리
		
		Drawable[] dArray = new Drawable[10];
		
		//사각형관리
		Drawable r01 = new Rectangle("빨강", "검정", 5, 5);
		Drawable r02 = new Rectangle("노랑", "노랑", 100, 20);
		Drawable r03 = new Rectangle("파랑", "파랑", 10, 5);
		//원관리
		Drawable c01 = new Circle("빨강", "검정", 7);
		Drawable c02 = new Circle("노랑", "노랑", 20);
		Drawable c03 = new Circle("파랑", "파랑", 15);
		//삼각형관리
		Drawable t01 = new Triangle("빨강", "검정", 3, 7);
		Drawable t02 = new Triangle("노랑", "노랑", 100, 20);
		Drawable t03 = new Triangle("파랑", "파랑", 10, 5);
		
		Drawable p01 = new Point(3, 4);
		
		dArray[0] = r01;
		dArray[1] = r02;
		dArray[2] = r03;
		dArray[3] = c01;
		dArray[4] = c02;
		dArray[5] = c03;
		dArray[6] = t01;
		dArray[7] = t02;
		dArray[8] = t03;
		dArray[9] = p01;
		
		for(int i=0;i<dArray.length;i++) {
			dArray[i].draw();
		}
		
		System.out.println("=======================");
		
		//Shape(도형)의 면적 출력하기
		for(int i=0;i<dArray.length;i++) {
				printArea(dArray[i]);
		}
	}

	public static void printArea(Drawable d) {
		if(d instanceof Shape) {
			System.out.println(((Shape)d).area());
		} else {
			System.out.println("점은 면적이 없습니다.");
		}
	}

}
