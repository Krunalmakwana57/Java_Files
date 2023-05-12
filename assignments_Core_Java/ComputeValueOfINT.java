package assignments_Core_Java;

import java.util.Scanner;

public class ComputeValueOfINT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Single Didit Number : ");
		int num = sc.nextInt();
		int num1 = num;
		
		System.out.println(num1);
		do {
			num = num * 10 + num1;
			System.out.println(num);
		}while(num/111 == 0);
		
	}
}
