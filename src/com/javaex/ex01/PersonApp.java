package com.javaex.ex01;

//상속에 대해 배워보자(super, extends키워드를 사용해보자)

public class PersonApp {

	public static void main(String[] args) {
		
		Person p1 = new Person("정우성", 45);
		System.out.println(p1.toString());
		p1.showInfo();
		
		Student s1 = new Student("서울고등학교");
		Student s2 = new Student("이정재", 45, "한국고등학교");
		
		s1.showInfo();
		s2.showInfo();
		

	}
}
