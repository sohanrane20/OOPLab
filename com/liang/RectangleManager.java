package com.liang;
import java.util.Scanner;
class Rectangle {
	double width = 1, height = 1;
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	double getArea() {
		return width * height;
	}
	double getPerimeter() {
		return 2 * (width + height);
	}
}
public class RectangleManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double width, height;
		System.out.print("Enter width: ");
		width = input.nextDouble();
		System.out.print("Enter height: ");
		height = input.nextDouble();
		Rectangle rectangle = new Rectangle(width, height);
		System.out.println("Width = " + rectangle.width);
		System.out.println("Height = " + rectangle.height);
		System.out.println("Area = " + rectangle.getArea());
		System.out.println("Perimeter = " + rectangle.getPerimeter());
		input.close();
	}
}
