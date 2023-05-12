package assignments_Core_Java;

import java.util.Scanner;
class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

public class ConstructorRectAndSqr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value for Height and Breadth : ");
		int height = sc.nextInt();
		int breadth = sc.nextInt();
		Rectangle rectangle = new Rectangle(height, breadth);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        // create a square with side 4
        System.out.println("Enter Value for Side : ");
        int side = sc.nextInt();
        Square square = new Square(side);
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());
	}
}
