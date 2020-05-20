package com.javaex.ex01;

//1.상속에 대해 배워보자(super, extends키워드를 사용해보자)

//2.오버라이딩에 대해 배워보자(자식클래스와 부모 클래스의 메소드 명이 같을 경우 자식이 부모클래스를 덮는다.)

public class Student extends Person {
		
	private String scholName;
	
	public Student() {}
	public Student(String scholName) {
		this.scholName = scholName;
	}
	public Student(String name, int age, String scholName) {
		super(name, age);
		this.scholName = scholName;
	}

	public String getScholName() {
		return scholName;
	}
	public void setScholName(String scholName) {
		this.scholName = scholName;
	}
	
	@Override
	public String toString() {
		return "Student [scholName=" + scholName + "]";
	}
	//하나만 상속받았을 경우 super는 생략가능.
	public void showInfo() {
		System.out.println("이름: " + super.name + "/ 나이: " + super.age + "/ 학교: " + scholName);
	}

}
