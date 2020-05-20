package com.javaex.ex03;

//클래스를 배열로 관리하기

public class ShapeApp {

	public static void main(String[] args) {
		
		Rectangle[] rArray = new Rectangle[3];
		Rectangle r1 = new Rectangle("검정", "검정", 5, 5);
		Rectangle r2 = new Rectangle("파랑", "검정", 6, 6);
		Rectangle r3 = new Rectangle("노랑", "검정", 7, 7);
		rArray[0] = r1;
		rArray[1] = r2;
		rArray[2] = r3;
		
		Circle[]  cArray = new Circle[3];
		Circle c1 = new Circle("노랑", "연두", 10);
		Circle c2 = new Circle("검정", "연두", 10);
		Circle c3 = new Circle("남색", "연두", 10);
		cArray[0] = c1;
		cArray[1] = c2;
		cArray[2] = c3;
		
		Triangle[] tArray = new Triangle[3];
		Triangle t1 = new Triangle("빨강", "노랑", 5,15);
		Triangle t2 = new Triangle("노랑", "노랑", 5,15);
		Triangle t3 = new Triangle("주황", "노랑", 5,15);
		tArray[0] = t1;
		tArray[1] = t2;
		tArray[2] = t3;
		
		Shape sc = new Circle("무지개", "오색찬란", 52);
		
		for(int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}
		for(int i = 0; i < tArray.length; i++) {
			tArray[i].draw();
		}
		for(int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
		
	}
}
