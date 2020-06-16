package com.javaex.ex04;

public class Rectangle extends Shape{
	
	//변수선언
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {}
	
	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	//getter/setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	//일반메소드

	public void draw() {
		System.out.println("[사각형] #면색:" + super.getFillColor() + ", #선색:" + super.getLineColor() + ", #가로:" + width + ", #세로:" + height);
	}

}
