package com.javaex.ex01;

//상속에 대해 배워보자(super, extends키워드를 사용해보자)

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
	
	public void showInfo() {
		System.out.println("이름: " + this.name + "/ 나이: " + this.age);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
