package lab1;
import java.util.Scanner;
import java.lang.Math;
class CircleRadius
{
	int radius;
	CircleRadius(int radius)
	{
		this.radius = radius;
	}
	int diameter()
	{
		return 2 * radius;
	}
	double circumference()
	{
		return 2 * Math.PI * radius;
	}
	double area()
	{
		return Math.PI * radius * radius;
	}
}
public class Circle 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");
		int radius = input.nextInt();
		CircleRadius circle = new CircleRadius(radius);
		System.out.println("Radius of Circle is " + circle.radius);
		System.out.println("Diameter of Circle is " + circle.diameter());
		System.out.println("Circumference of Circle is " + circle.circumference());
		System.out.println("Area of Circle is " + circle.area());
	}
}
