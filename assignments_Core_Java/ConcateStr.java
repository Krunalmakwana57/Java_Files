package assignments_Core_Java;

import java.util.Scanner;

public class ConcateStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String : ");
		String str = sc.nextLine();
		System.out.print("Enter Second String : ");
		String str1 = sc.nextLine();
		
		System.out.println(str.concat(str1));
		
	}
}
