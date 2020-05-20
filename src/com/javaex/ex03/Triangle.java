package com.javaex.ex03;

//클래스를 배열로 관리하기

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	public Triangle() {}
	public Triangle(String fillColor, String lineColor, int width, int heght) {
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
	public void setHeght(int height) {
		this.height = height;
	}
	
	public void draw() {
		System.out.println("삼각형(면 색:" + super.fillColor + "/ 선 색:" + super.lineColor + "/ 가로:" + this.width + " /세로:" + this.height + ")을 그렸습니다.");
	}
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}
}
