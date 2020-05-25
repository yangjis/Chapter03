package com.javaex.ex05;

//예외처리 종류를 알아보자

import java.util.Scanner;

public class ArithmeticException {

	public static void main(String[] args) {
		
		double result;
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("100으로 나눌 숫자 입력: ");
		num = scan.nextInt();
		
		try {
			result = 100/num;
			System.out.println(result);
			
		}catch(Exception e){
			
			System.out.println("0으로 나눌 수 없음.");
			System.out.println(e.toString());
		}finally {
			System.out.println("finally영역");
		}
		
		scan.close();
	}
}
