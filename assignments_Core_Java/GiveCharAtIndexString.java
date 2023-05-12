package assignments_Core_Java;

import java.util.Scanner;

public class GiveCharAtIndexString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A String : ");
		String str = sc.nextLine();
		
		System.out.print("Enter Value Of Character You Want : ");
		int val = sc.nextInt();
		
		System.out.println(str.charAt(val));
		
	}
}
