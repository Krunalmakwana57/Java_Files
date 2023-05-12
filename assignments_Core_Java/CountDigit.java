package assignments_Core_Java;

import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Positive Integer : ");
		int pint = sc.nextInt();
		int count = 0;
		if(pint <= 0) {
			System.out.println("Please Enter Positive Integer Or Greater Than Zero");
		}else {
			while(pint != 0) {
				pint /= 10;
				count++;
			}
		}
		System.out.println(count);
		
	}
}
