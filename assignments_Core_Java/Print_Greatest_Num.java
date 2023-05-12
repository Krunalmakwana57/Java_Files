package assignments_Core_Java;

import java.util.Scanner;

public class Print_Greatest_Num {
	public static void main(String[] args) {
		//Created Object Of Scanner Class To take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int num2 = sc.nextInt();
		System.out.print("Enter Number 3 : ");
		int num3 = sc.nextInt();
		//This is Ternary Operator
		//first condition is checked if num1 is greater than both num2 and num3 
		//num1 will be printed if num2 is greater than first condition will be false
		//and num2 will be compared to num3 if num2 is greatest it will be printed
		//otherwise num3 will be printed
		int max = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;
		
		System.out.println("Greatest Number is : "+max);
		
	}
}
