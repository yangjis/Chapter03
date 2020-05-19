package com.javaex.ex01;

//상속에 대해 배워보자(super, extends키워드를 사용해보자)

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
