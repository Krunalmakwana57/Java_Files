package assignments_Core_Java;

import java.util.Scanner;

public class CountInputString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		int letters = 0;
		int spaces = 0;
		int digits = 0;
		int other = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isLetter(c)) {
				letters++;
			}else if(Character.isWhitespace(c)) {
				spaces++;
			}else if(Character.isDigit(c)) {
				digits++;
			}else {
				other++;
			}
		}
		
		System.out.println("Total Letters are : " + letters);
		System.out.println("Total Spaces are : " + spaces);
		System.out.println("Total Digits are : " + digits);
		System.out.println("Total SpecialCharacters are : " + other);
	}
}
