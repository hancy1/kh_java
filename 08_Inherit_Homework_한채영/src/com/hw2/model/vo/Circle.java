package com.hw2.model.vo;

public class Circle extends Point {

	private int radius;

	public Circle() {
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {

		System.out.println("(x, y) : (" + super.getX() + ", " + super.getY() + ")");
		double area = Math.PI * radius * radius; // 면적
		double circumference = 2 * Math.PI * radius; // 둘레
		String a = "면적";
		String b = "둘레";

		System.out.printf("%s: %.1f\n", a, area);
		System.out.printf("%s: %.1f\n", b, circumference);

	}
}
