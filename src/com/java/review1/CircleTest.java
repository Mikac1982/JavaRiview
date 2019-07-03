package com.java.review1;

public class CircleTest {

	public static void main(String[] args) {

		Circle cir1 = new Circle();

		System.out.println(cir1.toString());
		System.out.println("The area of this circle is: " + cir1.getArea());
		// cir1.setRadius(2.3);
		// cir1.setColor("blue");

		System.out.println();

		Circle cir2 = new Circle(3.1);
		// cir1.setColor("black");
		System.out.println(cir2.toString());
		System.out.println("The area of this circle is: " + cir2.getArea());

		System.out.println();

		Circle cir3 = new Circle(0.0, "purple");
		cir3.setRadius(0.0);
		cir3.setColor("purple");
		System.out.println(cir3.toString());
		System.out.println("The area of this circle is: " + cir3.getArea());

		System.out.println();

		Circle cir4 = new Circle(1.4, "blue");
		cir4.setColor("blue");
		System.out.println(cir4.toString());
		System.out.println("The area of this circle is: " + cir4.getArea());
		System.out.println();

		Circle cir5 = new Circle(2.3, "yellow");
		cir4.setColor("yellow");
		System.out.println(cir5.toString());
		System.out.println("The area of this circle is: " + cir5.getArea());
	}
}
