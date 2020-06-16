package com.javaex.ex07;

public class Circle extends Shape implements Drawable {
	
	private int radius;
	
	public Circle() {}
	
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("[원] #면색:" + super.getFillColor() + ", #선색:" + super.getLineColor() + ", #반지름:" + radius);
	}
	
	public double area() {
		return radius*radius*3.14;
	}
	
	

}
