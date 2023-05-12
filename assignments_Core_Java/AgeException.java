package assignments_Core_Java;

import java.util.Scanner;

class Age{
	public void voteEligible(int age) {
		if(age >= 18) {
			System.out.println("Welcome to Vote");
		}else {
			throw new ArithmeticException();
		}
	}
}

public class AgeException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Age a = new Age();
			System.out.println("Enter Your Age : ");
			int age = sc.nextInt();
			a.voteEligible(age);
		}catch(ArithmeticException e) {
			System.out.println("Not Valid");
		}
	}
}
