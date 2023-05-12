package assignments_Core_Java;

import java.util.Scanner;

class FindData{
	public void getData(int length,int breadth) {
		int Area = length*breadth;
		System.out.println("Area Of Rectangle is "+Area);
	}
	public void getData(int side) {
		int area = side*side;
		System.out.println("Area Of Square is "+area);
	}
}

public class RectAndSquar {
	public static void main(String[] args) {
		FindData fd = new FindData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height and Breadth : ");
		int height = sc.nextInt();
		int breadth = sc.nextInt();
		fd.getData(height, breadth);
		
		System.out.print("\nEnter Side of Squar : ");
		int side = sc.nextInt();
		fd.getData(side);
	}
}
