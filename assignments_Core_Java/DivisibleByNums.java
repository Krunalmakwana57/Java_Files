package assignments_Core_Java;

import java.util.Scanner;

public class DivisibleByNums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number Between 1 to 100 : ");
		int num = sc.nextInt();
		if(num%3 == 0 && num%5 == 0 && num < 100 && num > 1) {
			System.out.println(num + " Can Divisible by 3 & 5");
		}else if(num%3 == 0 && num%5 == 0) {
			System.out.println(num + " Number Can divisible but it is outOf Range");
		}else {
			System.out.println(num + " Cannot be Divisible by 3 & 5");
		}
	}
}
