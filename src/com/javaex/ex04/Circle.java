package com.javaex.ex04;

//오버라이드하기

public class Circle extends Shape{
	
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
		System.out.println("원형(면 색:" + super.fillColor + "/ 선 색:" + super.lineColor + "/ 반지름:" + this.radius + ")을 그렸습니다.");
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
}
