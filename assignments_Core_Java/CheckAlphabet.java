package assignments_Core_Java;

import java.util.Scanner;

public class CheckAlphabet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char c = scanner.next().toLowerCase().charAt(0);

        if (!Character.isLetter(c)) {
            System.out.println("Error: Please enter a letter.");
        } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
	}
}
