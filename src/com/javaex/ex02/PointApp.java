package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(4, 4);
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		
		p1.showInfo();
		cp1.showInfo();
		cp2.showInfo();
	}

}
