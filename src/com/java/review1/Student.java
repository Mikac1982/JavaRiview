package com.java.review1;

public class Student extends Person{

	String studentName;
	
	public Student() {
		
	}
	
	public Student(String name, int age, int weight) {
		super();
	//	super.name=name;
		this.name=name; //we can use this as well cause it inherit parent class
		this.age=age;
		this.weight=weight;
	}
	
	public void sleep() {
		System.out.println("Students sleep in class");
		
	}
	@Override
	public void displayInfo() {
	//	super.displayInfo();
		System.out.println("I am a student. My name is "+name+" .My namber is "+studentName);
		eat();
	}
	
	
	
	
	
	
	
	
}
