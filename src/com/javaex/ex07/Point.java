package com.javaex.ex07;

public class Point implements Drawable {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//getter/setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//일반메소드
	public void draw() {
		System.out.println("#x:" + x + ", #y:" + y);
	}

	
	

}
