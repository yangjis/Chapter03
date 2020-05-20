package com.javaex.ex01;

//1.상속에 대해 배워보자(super, extends키워드를 사용해보자)

//2.오버라이딩에 대해 배워보자(자식클래스와 부모 클래스의 메소드 명이 같을 경우 자식이 부모클래스를 덮는다.)

public class PersonApp {

	public static void main(String[] args) {
		
		/*Person p1 = new Person("정우성", 45);
		System.out.println(p1.toString());
		p1.showInfo();
		
		Student s1 = new Student("서울고등학교");
		Student s2 = new Student("이정재", 45, "한국고등학교");
		
		s1.showInfo();
		s2.showInfo();*/
		
		//섞어쓰기(오버라이딩, 오버라이드)
		Person p = new Student("정우성", 45, "서울고등학교");
		p.showInfo();
		System.out.println(p.toString());
		
		((Student)p).setScholName("제주고등학교");
		p.showInfo();
		
		System.out.println(((Student)p).getScholName());
		
		
		
	}
}
