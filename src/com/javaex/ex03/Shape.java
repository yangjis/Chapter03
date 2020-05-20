package com.javaex.ex03;

//클래스를 배열로 관리하기

public class Shape {

	protected String fillColor;
	protected String lineColor;
	
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
		System.out.println("면 색:" + this.fillColor + "/ 선 색:" + this.lineColor);
	}
	
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
}
