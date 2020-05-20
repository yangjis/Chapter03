package com.javaex.ex04;

//오버라이드하기

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape[] sArray = new Shape[9];
		
		Shape r1 = new Rectangle("검정", "검정", 5, 5);
		Shape r2 = new Rectangle("파랑", "검정", 6, 6);
		Shape r3 = new Rectangle("노랑", "검정", 7, 7);
		
		Shape c1 = new Circle("노랑", "연두", 10);
		Shape c2 = new Circle("검정", "연두", 10);
		Shape c3 = new Circle("남색", "연두", 10);
		
		Shape t1 = new Triangle("빨강", "노랑", 5,15);
		Shape t2 = new Triangle("노랑", "노랑", 5,15);
		Shape t3 = new Triangle("주황", "노랑", 5,15);
		
		sArray[0] = r1;
		sArray[1] = r1;
		sArray[2] = r1;
		
		sArray[3] = c1;
		sArray[4] = c1;
		sArray[5] = c1;
		
		sArray[6] = t1;
		sArray[7] = t1;
		sArray[8] = t1;
		
		for(int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
		}
		
		System.out.println(((Rectangle)r1).getWidth());
		
	}
}
