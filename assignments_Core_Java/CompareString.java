package assignments_Core_Java;

import java.util.Scanner;

public class CompareString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First String : ");
		String str = sc.nextLine();
		
		System.out.println("Enter Second String : ");
		String str1 = sc.nextLine();
		
		if(str.compareTo(str1) == 0) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}
}
