package com.java.review1;

public class Circle {

	private double radius;
	private String color;

	public Circle() {
		System.out.println("Constructor with NO parameters");
		radius = 1.0;
		color = "red";
	}

	public Circle(double radius) {
		System.out.println("Constructor with 1 parameter: " + radius);
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this(radius);
		System.out.println("Constructor with 2 parameters: " + radius + ", " + color);
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			System.out.println("Radius has to be more than 0");
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.equals("red") || color.equals("blue") || color.equals("green")) {
			this.color = color;
		} else {
			System.out.println("You got the wrong color, try again!");
		}
	}

	public String toString() {
		return ("Radius of the circle is " + radius + ", and color is " + color);
	}

	public double getArea() {
		return (radius * radius) * 3.14;
	}

}
