package com.javaex.ex05;

//예외처리 종류를 알아보자

public class NullPointerEception {

	public static void main(String[] args) {
		
		String str = new String("안녕하세요");
		
		str = null;
		
		try {
			System.out.println(str.toString());
		}catch(NullPointerException e) {
			System.out.println("참조값(주소)이 없습니다.");
		}
	}
}
