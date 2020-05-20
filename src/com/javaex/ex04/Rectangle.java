package com.javaex.ex04;

//오버라이드하기

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
	public Rectangle() {}
	public Rectangle(String fillColor, String lineColor, int width, int height) {
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
		System.out.println("사각형(면 색:" + super.fillColor + "/ 선 색:" + super.lineColor + "/ 가로:" + this.width + "/ 세로:" + this.height + ")을 그렸습니다.");
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}
}
