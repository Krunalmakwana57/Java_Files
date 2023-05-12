package assignments_Core_Java;

import java.util.Scanner;

abstract class Shape{
	abstract public void rectangleArea(int l,int b);
	abstract public void squareArea(int s);
	abstract public void circleArea(int r);
}

class Area extends Shape{
	public void rectangleArea(int l,int b) {
		System.out.println("Area Of Rectangle is = "+(l*b));
	}
	public void squareArea(int s) {
		System.out.println("Area of Square is = "+(s*s));
	}
	public void circleArea(int r) {
		double pi = 3.14159265359;
		System.out.println("Area of Circle is = "+(pi*r*r));
	}
}

public class ShapeClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of Height and Breadth = ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		Area a = new Area();
		a.rectangleArea(l,b);
		System.out.print("Enter value of Side = ");
		int s = sc.nextInt();
		a.squareArea(s);
		System.out.print("Enter value of Radius = ");
		int r = sc.nextInt();
		a.circleArea(r);
	}
}
