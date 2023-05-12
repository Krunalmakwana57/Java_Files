package assignments_Core_Java;

import java.util.Scanner;

public class ASCIIvalueOfChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Character To know ASCII Value : ");
		char ch = sc.next().charAt(0);
		
		int num = (int) ch;
		
		System.out.println(num);
		
	}
}
