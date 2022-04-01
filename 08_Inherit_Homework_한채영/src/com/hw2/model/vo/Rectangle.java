package com.hw2.model.vo;

public class Rectangle extends Point {
	private int width;
	private int height;

	public Rectangle() {
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {

		System.out.println("(x, y) : (" + super.getX() + ", " + super.getY() + ")");
		int area = width * height;
		int circumference = 2 * (width + height);
		String a = "면적";
		String b = "둘레";

		System.out.printf("%s: %d\n", a, area);
		System.out.printf("%s: %d\n", b, circumference);

	}

}
