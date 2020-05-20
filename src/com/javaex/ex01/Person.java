package com.javaex.ex01;

//1.상속에 대해 배워보자(super, extends키워드를 사용해보자)

//2.오버라이딩에 대해 배워보자(자식클래스와 부모 클래스의 메소드 명이 같을 경우 자식이 부모클래스를 덮는다.)

public class Person {
	
	protected String name;
	protected int age;
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void showInfo() {
		System.out.println("이름: " + this.name + "/ 나이: " + this.age);
	}
	
}
