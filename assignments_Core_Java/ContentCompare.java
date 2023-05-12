package assignments_Core_Java;

import java.util.Scanner;

public class ContentCompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String 1 : ");
		String str = sc.nextLine();
		System.out.print("Enter String 2 : ");
		String str1 = sc.nextLine();
		
		if(str.contains(str1)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
