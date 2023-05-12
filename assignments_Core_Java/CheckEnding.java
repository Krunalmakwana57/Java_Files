package assignments_Core_Java;

import java.util.Scanner;

public class CheckEnding {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String : ");
		String str = sc.nextLine();
		System.out.print("Enter Second String : ");
		String str1 = sc.nextLine();
		
		if(str.charAt(str.length()-1) == str1.charAt(str1.length()-1)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
