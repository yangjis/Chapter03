package com.javaex.ex05;

//예외처리 종류를 알아보자
		
public class ArrayException {
	
	public static void main(String[] args) {
		
		int intArray[] = new int[] {3,6,9};
		
		/*intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;*/
		
		try {
			System.out.println(intArray[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 초과");
		}
	}

}
