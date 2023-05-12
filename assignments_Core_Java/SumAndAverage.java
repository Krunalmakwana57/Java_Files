package assignments_Core_Java;

import java.util.Scanner;

public class SumAndAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		for(int i = 0; i < num.length; i++) {
			System.out.print("Enter value at ["+i+"] : ");
			num[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
//			System.out.println(sum);
		}
		System.out.println("Total = "+sum);
		double average = (double)sum/5;
		System.out.println("Average of Sum is "+average);
	}
}
