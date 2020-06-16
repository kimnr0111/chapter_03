package com.javaex.ex06;

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	public Triangle() {}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

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

	public void draw() {
		System.out.println("[삼각형] #면색:" + super.getFillColor() + ", #선색:" + super.getLineColor() + ", #가로:" + width + ", #세로:" + height);
	}
	
	public double area() {
		return width*height/2.0;
	}

}
