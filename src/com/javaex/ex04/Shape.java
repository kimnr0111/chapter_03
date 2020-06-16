package com.javaex.ex04;

public class Shape {
	
	private String fillColor;
	private String lineColor;
	//protected String fillColor; protected = 자식클래스에서 그대로 사용가능

	
	public Shape() {}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	public void draw() {
		
	}

}
